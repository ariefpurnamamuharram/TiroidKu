package id.diabeteslab.tiroidku.topic

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import id.diabeteslab.tiroidku.R
import id.diabeteslab.tiroidku.app.AppView
import kotlinx.android.synthetic.main.activity_topic.*

class TopicActivity : AppCompatActivity(), AppView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topic)
        // Initialize activity
        initActivity()
    }

    override fun initActivity() {
        // Get activity intent
        val title: Int = intent.getIntExtra("title", 0)
        val body: Int = intent.getIntExtra("body", 0)
        val img: Int = intent.getIntExtra("img", 0)

        topic_title.setText(title)
        topic_body.setText(body)
        topic_img.setImageResource(img)
    }
}