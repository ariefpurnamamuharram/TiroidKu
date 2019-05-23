package id.diabeteslab.tiroidku.main

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import id.diabeteslab.tiroidku.R
import id.diabeteslab.tiroidku.topic.TopicActivity
import kotlinx.android.synthetic.main.item_topic.view.*
import org.jetbrains.anko.startActivity

class TopicsAdapter(private val topics: List<Topics>) : RecyclerView.Adapter<TopicsViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): TopicsViewHolder {
        return TopicsViewHolder(
            LayoutInflater.from(p0.context).inflate(
                R.layout.item_topic,
                p0,
                false
            )
        )
    }

    override fun getItemCount(): Int = topics.size

    override fun onBindViewHolder(p0: TopicsViewHolder, p1: Int) {
        p0.bindItem(topics[p1])
    }
}

class TopicsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val topicTitle = view.item_title
    private val topicBody = view.item_body
    private val topicImg = view.item_img
    private val topicDetailButton = view.item_btn_details

    fun bindItem(item: Topics) {
        topicTitle.setText(item.title)
        topicBody.setText(item.body)
        topicImg.setImageResource(item.img)

        val toastTopicTitle = itemView.context.getString(item.title)

        topicDetailButton.setOnClickListener {
            itemView.context.startActivity<TopicActivity>(
                "title" to item.title, "body" to item.body, "img" to item.img)
        }

        itemView.setOnClickListener {
            Toast.makeText(
                itemView.context,
                "Anda memilih topik edukasi $toastTopicTitle",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}