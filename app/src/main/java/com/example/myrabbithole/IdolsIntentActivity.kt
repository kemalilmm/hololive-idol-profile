package com.example.myrabbithole

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class IdolsIntentActivity : AppCompatActivity()  {
    companion object{
        const val EXTRA_IMAGES = "Images"
        const val EXTRA_NAMES= "Names"
        const val EXTRA_CHANNEL = "Youtube Channel"
        const val EXTRA_PERSONALITY = "Personality"
        const val EXTRA_SUBSCOUNT = "Subs Count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_idols_intent)
        var backButton: ImageButton=findViewById(R.id.back_button)
        backButton.setOnClickListener {
            finish()
        }
        val idolsImages:CircleImageView=findViewById(R.id.intent_idols)
        val idolsBanner:ImageView=findViewById(R.id.banner)
        val idolsPersonality:TextView=findViewById(R.id.personality)
        val idolSubsCount:TextView=findViewById(R.id.subs_count)
        val intentDataSubsCount=intent.getStringExtra(EXTRA_SUBSCOUNT)
        val intentDataImages = intent.getStringExtra(EXTRA_IMAGES)
        val intentDataNames = intent.getStringExtra(EXTRA_NAMES)
        val intentDataChannel = intent.getStringExtra(EXTRA_CHANNEL)
        val intentDataPersonality = intent.getStringExtra(EXTRA_PERSONALITY)
        val idolsNames :TextView = findViewById(R.id.idols_name)
        val idolsChannel : TextView = findViewById(R.id.stream_channel)
        val images = if(intentDataImages=="Nakiri Ayame"){
            R.drawable.ayame
        }else if(intentDataImages=="Shirakami Fubuki"){
            R.drawable.fubuki
        }
        else if (intentDataImages=="Amelia Watson"){
            R.drawable.amelia_watson
        }
        else if(intentDataImages=="Inugami Korone"){
            R.drawable.korone
        }
        else if(intentDataImages=="Himemori Luna"){
            R.drawable.luna
        }
        else if(intentDataImages=="Sakura Miko"){
            R.drawable.mikochi
        }
        else if(intentDataImages=="Shishiro Botan"){
            R.drawable.ssrb
        }
        else if(intentDataImages=="Momosuzu Nene"){
            R.drawable.super_nenechi
        }
        else if(intentDataImages=="Uruha Rushia"){
            R.drawable.uruha_rushia
        }
        else if(intentDataImages=="Tsunomaki Watame"){
            R.drawable.watame
        }
        else{
            R.drawable.mikochi
        }

        val imagesBanner = if(intentDataImages=="Nakiri Ayame"){
            R.drawable.ayame_banner
        }else if(intentDataImages=="Shirakami Fubuki"){
            R.drawable.fubuki_banner
        }
        else if (intentDataImages=="Amelia Watson"){
            R.drawable.gremlin_banner
        }
        else if(intentDataImages=="Inugami Korone"){
            R.drawable.korone_banner
        }
        else if(intentDataImages=="Himemori Luna"){
            R.drawable.luna_banner
        }
        else if(intentDataImages=="Sakura Miko"){
            R.drawable.mikochi_banner
        }
        else if(intentDataImages=="Shishiro Botan"){
            R.drawable.botan_banner
        }
        else if(intentDataImages=="Momosuzu Nene"){
            R.drawable.supernenechi_banner
        }
        else if(intentDataImages=="Uruha Rushia"){
            R.drawable.rushia_banner
        }
        else if(intentDataImages=="Tsunomaki Watame"){
            R.drawable.watame_banner
        }
        else{
            R.drawable.mikochi_banner
        }
        idolsImages.setImageResource(images)
        idolsNames.text=intentDataNames
        idolsChannel.text=intentDataChannel
        idolsBanner.setImageResource(imagesBanner)
        idolSubsCount.text=intentDataSubsCount
        idolsPersonality.text = intentDataPersonality
    }

}