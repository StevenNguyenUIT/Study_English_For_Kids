package com.nhinhnguyenuit.studyenglishforkids

import android.app.Dialog
import android.content.ActivityNotFoundException
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.nhinhnguyenuit.studyenglishforkids.databinding.ActivityAboutBinding

class ActivityAbout : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding

    private lateinit var popUpDetail: Dialog
    private lateinit var devPhoto: ImageView
    private lateinit var namaDev: TextView
    private lateinit var profDev: TextView
    private lateinit var descDev: TextView
    private lateinit var exitButtonPopUp: ImageButton
    private lateinit var kerjaIcon: ImageButton
    private lateinit var buttonkerja1: TextView
    private lateinit var buttonkerja2: ImageButton
    private lateinit var buttonkerja3: ImageButton
    private lateinit var buttonkerja4: ImageButton
    private lateinit var buttonkontak: Button

    private lateinit var popupdonate: Dialog
    private lateinit var textdonate: TextView
    private lateinit var xButton: ImageButton

    var nama = ""
    var photo = ""
    var profesi = ""
    var desc = ""
    var work = ""
    var link1 = ""
    var link2 = ""
    var link3 = ""
    var link4 = ""
    var kontak = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        popUpDetail = Dialog(this)
        popupdonate = Dialog(this)

        binding.buttonBack.setOnClickListener {
            finish()
            overridePendingTransition(R.anim.slide_out_right, R.anim.slide_in_left)
        }

        binding.profileport.setOnClickListener {
            nama = "Steven Nguyen"
            photo = "port"
            profesi = "Android Developer"
            desc =
                "I am a Android Developer from HCM city who is interested in learning and exploring new things to improve my skills"
            work = "bh"
            link1 = "www.linkedin.com/in/nhinh-nguyenuit"
            link3 = "https://github.com/stevennguyenuit"
            kontak = "vannhinh91@gmail.com"
            dialog()
        }

        binding.donate.setOnClickListener {
            popupdonate.setContentView(R.layout.helpdialog)
            textdonate = popupdonate.findViewById(R.id.help)
            xButton = popupdonate.findViewById(R.id.button_xhelp)
            xButton.setOnClickListener {
                popupdonate.dismiss()
            }
            textdonate.text = getString(R.string.contact_developer)
            popupdonate.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            popupdonate.show()
        }
    }

    fun dialog() {
        popUpDetail.setContentView(R.layout.popupdetailabout)
        devPhoto = popUpDetail.findViewById(R.id.devphoto)
        namaDev = popUpDetail.findViewById(R.id.namadev)
        profDev = popUpDetail.findViewById(R.id.profesidev)
        descDev = popUpDetail.findViewById(R.id.descdev)
        exitButtonPopUp = popUpDetail.findViewById(R.id.exit_button_popup)
        kerjaIcon = popUpDetail.findViewById(R.id.kerja2)
        buttonkerja1 = popUpDetail.findViewById(R.id.kerja1)
        buttonkerja2 = popUpDetail.findViewById(R.id.kerja2)
        buttonkerja3 = popUpDetail.findViewById(R.id.kerja3)
        buttonkerja4 = popUpDetail.findViewById(R.id.kerja4)
        buttonkontak = popUpDetail.findViewById(R.id.kontak)
//

        buttonkerja1.setOnClickListener {
            val work = Intent(Intent.ACTION_VIEW)
            work.data = Uri.parse(link1)
            startActivity(work)
        }
        buttonkerja2.setOnClickListener {
            val work = Intent(Intent.ACTION_VIEW)
            work.data = Uri.parse(link2)
            startActivity(work)
        }
        buttonkerja3.setOnClickListener {
            val work = Intent(Intent.ACTION_VIEW)
            work.data = Uri.parse(link3)
            startActivity(work)
        }
        buttonkerja4.setOnClickListener {
            val work = Intent(Intent.ACTION_VIEW)
            work.data = Uri.parse(link4)
            startActivity(work)
        }
        buttonkontak.setOnClickListener {
            val i = Intent(Intent.ACTION_SENDTO)
            i.data = Uri.parse("mailto:$kontak")
            try {
                startActivity(i)
            } catch (ex: ActivityNotFoundException) {
                Toast.makeText(this, "There are no email clients installed.", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        when (photo) {
            "port" -> {
                devPhoto.setImageResource(R.drawable.sntv_logo)

            }

            else -> {
                devPhoto.setImageResource(R.drawable.stevennguyentv)
            }
        }

        when (work) {
            "bh" -> {
                kerjaIcon.setImageResource(R.mipmap.behance)
            }

            else -> {
                kerjaIcon.setImageResource(R.mipmap.whatsapp)
            }
        }

        namaDev.text = nama
        profDev.text = profesi
        descDev.text = desc
        exitButtonPopUp.setOnClickListener {
            popUpDetail.dismiss()
        }
//
        popUpDetail.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        popUpDetail.show()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
        overridePendingTransition(R.anim.slide_out_right, R.anim.slide_in_left)
    }
}
