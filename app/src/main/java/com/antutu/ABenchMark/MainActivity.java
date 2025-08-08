package com.antutu.ABenchMark;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    private ValueAnimator animator;
    // reuse this to avoid per-frame allocations
    private final float[] hsv = new float[]{0f, 1f, 1f};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView text = findViewById(R.id.gaymingText);

        // ensure the TextView uses hardware layer for smooth rotation
        text.setLayerType(View.LAYER_TYPE_HARDWARE, null);

        // Single animator drives rotation (0-360) and hue (0-360)
        animator = ValueAnimator.ofFloat(0f, 1f);
        animator.setDuration(2000); // full cycle (ms) — tweak if you want slower/faster
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setRepeatMode(ValueAnimator.RESTART);
        animator.addUpdateListener(animation -> {
            float frac = (float) animation.getAnimatedValue();

            // rotation: hardware-accelerated property
            text.setRotation(frac * 360f);

            // color: compute hue directly, reuse hsv array
            hsv[0] = frac * 360f; // hue 0..360
            // hsv[1] and hsv[2] remain 1f for vivid colors
            int color = Color.HSVToColor(hsv);
            text.setTextColor(color);
        });
        animator.start();
    }

    @Override
    protected void onDestroy() {
        // cancel to avoid leaks
        if (animator != null) {
            animator.cancel();
            animator = null;
        }
        super.onDestroy();
    }
}
