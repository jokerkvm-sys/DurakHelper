package com.example.durakhelper

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(28, 28, 28, 28)
        }
        val title = TextView(this).apply {
            text = "Durak Helper — prototype"
            textSize = 23f
        }
        val info = TextView(this).apply {
            text = "\nPrototype for screen-based card recognition and move suggestions.\n\n" +
                "It will not tap or play cards automatically. Card recognition and strategy " +
                "are not implemented in this first build."
            textSize = 16f
        }
        val overlayButton = Button(this).apply {
            text = "Allow floating window"
            setOnClickListener {
                if (!Settings.canDrawOverlays(this@MainActivity)) {
                    val intent = Intent(
                        Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                        Uri.parse("package:$packageName")
                    )
                    startActivity(intent)
                }
            }
        }
        layout.addView(title)
        layout.addView(info)
        layout.addView(overlayButton)
        setContentView(layout)
    }
}
