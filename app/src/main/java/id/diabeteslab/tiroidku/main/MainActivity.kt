package id.diabeteslab.tiroidku.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import id.diabeteslab.tiroidku.R
import id.diabeteslab.tiroidku.app.AppView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AppView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Initialize activity
        initActivity()
    }

    override fun initActivity() {
        // Set application title
        supportActionBar?.title = "$title - Edukasi Kelenjar Tiroid untuk Awam"

        // Setup RecyclerView for educational topics
        val thyroidTopics = thyroidTopics()
        rv_topics.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = TopicsAdapter(thyroidTopics)
        }
    }
}
