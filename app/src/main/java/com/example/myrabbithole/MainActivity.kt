package com.example.myrabbithole

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView
import java.text.DecimalFormat

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var AboutMeButton : CircleImageView
    private lateinit var rvidols :RecyclerView
    private var list: ArrayList<Idol> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AboutMeButton = findViewById(R.id.about_me)
        AboutMeButton.setOnClickListener(this)
        rvidols = findViewById(R.id.rv_hololive_idols)
        rvidols.setHasFixedSize(true)
        list.addAll(Hololive_Idols.listData)
        showList()
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.about_me->{
                val aboutMeIntent = Intent(this@MainActivity,AboutMeActivity::class.java)
                startActivity(aboutMeIntent)
            }
        }
    }

    private fun showList(){
        rvidols.layoutManager = LinearLayoutManager(this)
        val listHololiveAdapter = HololiveIdolListAdapter(list)
        rvidols.adapter = listHololiveAdapter

        listHololiveAdapter.setOnItemClickCallback(object : HololiveIdolListAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Idol) {
                val idolsDataIntent=Intent(this@MainActivity,IdolsIntentActivity::class.java)
                idolsDataIntent.putExtra(IdolsIntentActivity.EXTRA_IMAGES,data.name)
                idolsDataIntent.putExtra(IdolsIntentActivity.EXTRA_NAMES,data.name)
                idolsDataIntent.putExtra(IdolsIntentActivity.EXTRA_CHANNEL,data.stream_channel)
                idolsDataIntent.putExtra(IdolsIntentActivity.EXTRA_PERSONALITY,data.personality)
                val dec = DecimalFormat("#,###")
                idolsDataIntent.putExtra(IdolsIntentActivity.EXTRA_SUBSCOUNT,dec.format(data.subsCount).toString())

                startActivity(idolsDataIntent)

            }
        })
    }

}