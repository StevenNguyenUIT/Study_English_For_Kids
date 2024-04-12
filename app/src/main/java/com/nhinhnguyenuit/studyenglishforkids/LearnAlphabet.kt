package com.nhinhnguyenuit.studyenglishforkids

import android.annotation.SuppressLint
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nhinhnguyenuit.studyenglishforkids.databinding.ActivityLearnAlphabetBinding

class LearnAlphabet : AppCompatActivity() {

    private lateinit var binding: ActivityLearnAlphabetBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_alphabet)

        binding = ActivityLearnAlphabetBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonback.setOnClickListener {
            onBackPressed()
        }
        binding.buttonA.setOnClickListener {
            binding.huruf.text = "Aa"
            binding.bahasaInggris.text = "Apple"
            binding.bahasaIndo.text = "Quả táo"
            binding.gambar.setImageResource(R.mipmap.a)
            soundOn()

            binding.buttonA.setBackgroundResource(R.drawable.clickedalfabeth)
            binding.buttonA.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(resources.getColor(R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(resources.getColor(R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(resources.getColor(R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(resources.getColor(R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(resources.getColor(R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(resources.getColor(R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(resources.getColor(R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(resources.getColor(R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(resources.getColor(R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(resources.getColor(R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(resources.getColor(R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(resources.getColor(R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(resources.getColor(R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(resources.getColor(R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(resources.getColor(R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(resources.getColor(R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(resources.getColor(R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(resources.getColor(R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(resources.getColor(R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(resources.getColor(R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(resources.getColor(R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(resources.getColor(R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(resources.getColor(R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(resources.getColor(R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(resources.getColor(R.color.white))
        }

        binding.buttonB.setOnClickListener {
            binding.huruf.text = "Bb"
            binding.bahasaInggris.text = "Banana"
            binding.bahasaIndo.text = "Quả Chuối"
            binding.gambar.setImageResource(R.mipmap.b)
            soundOn()

            binding.buttonB.setBackgroundResource(R.drawable.clickedalfabeth)
            binding.buttonB.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(resources.getColor(R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(resources.getColor(R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(resources.getColor(R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(resources.getColor(R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(resources.getColor(R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(resources.getColor(R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(resources.getColor(R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(resources.getColor(R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(resources.getColor(R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(resources.getColor(R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(resources.getColor(R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(resources.getColor(R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(resources.getColor(R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(resources.getColor(R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(resources.getColor(R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(resources.getColor(R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(resources.getColor(R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(resources.getColor(R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(resources.getColor(R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(resources.getColor(R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(resources.getColor(R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(resources.getColor(R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(resources.getColor(R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(resources.getColor(R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(resources.getColor(R.color.white))
        }

        binding.buttonC.setOnClickListener {
            binding.huruf.text = "Cc"
            binding.bahasaInggris.text = "Cat"
            binding.bahasaIndo.text = "Con Mèo"
            binding.gambar.setImageResource(R.mipmap.a)
            soundOn()

            binding.buttonC.setBackgroundResource(R.drawable.clickedalfabeth)
            binding.buttonC.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(resources.getColor(R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(resources.getColor(R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(resources.getColor(R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(resources.getColor(R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(resources.getColor(R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(resources.getColor(R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(resources.getColor(R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(resources.getColor(R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(resources.getColor(R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(resources.getColor(R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(resources.getColor(R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(resources.getColor(R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(resources.getColor(R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(resources.getColor(R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(resources.getColor(R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(resources.getColor(R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(resources.getColor(R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(resources.getColor(R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(resources.getColor(R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(resources.getColor(R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(resources.getColor(R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(resources.getColor(R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(resources.getColor(R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(resources.getColor(R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(resources.getColor(R.color.white))
        }

        binding.buttonD.setOnClickListener {
            binding.huruf.text = "Dd"
            binding.bahasaInggris.text = "Doctor"
            binding.bahasaIndo.text = "Bác Sỹ"
            binding.gambar.setImageResource(R.mipmap.d)
            soundOn()

            binding.buttonD.setBackgroundResource(R.drawable.clickedalfabeth)
            binding.buttonD.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(resources.getColor(R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(resources.getColor(R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(resources.getColor(R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(resources.getColor(R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(resources.getColor(R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(resources.getColor(R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(resources.getColor(R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(resources.getColor(R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(resources.getColor(R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(resources.getColor(R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(resources.getColor(R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(resources.getColor(R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(resources.getColor(R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(resources.getColor(R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(resources.getColor(R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(resources.getColor(R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(resources.getColor(R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(resources.getColor(R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(resources.getColor(R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(resources.getColor(R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(resources.getColor(R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(resources.getColor(R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(resources.getColor(R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(resources.getColor(R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(resources.getColor(R.color.white))
        }

        binding.buttonE.setOnClickListener {
            binding.huruf.text = "Ee"
            binding.bahasaInggris.text = "Elephant"
            binding.bahasaIndo.text = "Con Voi"
            binding.gambar.setImageResource(R.mipmap.e)
            soundOn()

            binding.buttonE.setBackgroundResource(R.drawable.clickedalfabeth)
            binding.buttonE.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(resources.getColor(R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(resources.getColor(R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(resources.getColor(R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(resources.getColor(R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(resources.getColor(R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(resources.getColor(R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(resources.getColor(R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(resources.getColor(R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(resources.getColor(R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(resources.getColor(R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(resources.getColor(R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(resources.getColor(R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(resources.getColor(R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(resources.getColor(R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(resources.getColor(R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(resources.getColor(R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(resources.getColor(R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(resources.getColor(R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(resources.getColor(R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(resources.getColor(R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(resources.getColor(R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(resources.getColor(R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(resources.getColor(R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(resources.getColor(R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(resources.getColor(R.color.white))
        }

        binding.buttonF.setOnClickListener {
            binding.huruf.text = "Ff"
            binding.bahasaInggris.text = "Fire truck"
            binding.bahasaIndo.text = "Xe cứu hỏa"
            binding.gambar.setImageResource(R.mipmap.f)
            soundOn()

            binding.buttonF.setBackgroundResource(R.drawable.clickedalfabeth)
            binding.buttonF.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(resources.getColor(R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(resources.getColor(R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(resources.getColor(R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(resources.getColor(R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(resources.getColor(R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(resources.getColor(R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(resources.getColor(R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(resources.getColor(R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(resources.getColor(R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(resources.getColor(R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(resources.getColor(R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(resources.getColor(R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(resources.getColor(R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(resources.getColor(R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(resources.getColor(R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(resources.getColor(R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(resources.getColor(R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(resources.getColor(R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(resources.getColor(R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(resources.getColor(R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(resources.getColor(R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(resources.getColor(R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(resources.getColor(R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(resources.getColor(R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(resources.getColor(R.color.white))
        }

        binding.buttonG.setOnClickListener {
            binding.huruf.text = "Gg"
            binding.bahasaInggris.text = "Guitar"
            binding.bahasaIndo.text = "Đàn Ghi ta"
            binding.gambar.setImageResource(R.mipmap.g)
            soundOn()

            binding.buttonG.setBackgroundResource(R.drawable.clickedalfabeth)
            binding.buttonG.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(resources.getColor(R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(resources.getColor(R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(resources.getColor(R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(resources.getColor(R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(resources.getColor(R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(resources.getColor(R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(resources.getColor(R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(resources.getColor(R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(resources.getColor(R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(resources.getColor(R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(resources.getColor(R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(resources.getColor(R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(resources.getColor(R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(resources.getColor(R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(resources.getColor(R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(resources.getColor(R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(resources.getColor(R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(resources.getColor(R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(resources.getColor(R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(resources.getColor(R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(resources.getColor(R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(resources.getColor(R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(resources.getColor(R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(resources.getColor(R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(resources.getColor(R.color.white))
        }

        binding.buttonH.setOnClickListener {
            binding.huruf.text = "Hh"
            binding.bahasaInggris.text = "Horse"
            binding.bahasaIndo.text = "Con Ngựa"
            binding.gambar.setImageResource(R.mipmap.h)
            soundOn()

            binding.buttonH.setBackgroundResource(R.drawable.clickedalfabeth)
            binding.buttonH.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(resources.getColor(R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(resources.getColor(R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(resources.getColor(R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(resources.getColor(R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(resources.getColor(R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(resources.getColor(R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(resources.getColor(R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(resources.getColor(R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(resources.getColor(R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(resources.getColor(R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(resources.getColor(R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(resources.getColor(R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(resources.getColor(R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(resources.getColor(R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(resources.getColor(R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(resources.getColor(R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(resources.getColor(R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(resources.getColor(R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(resources.getColor(R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(resources.getColor(R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(resources.getColor(R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(resources.getColor(R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(resources.getColor(R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(resources.getColor(R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(resources.getColor(R.color.white))
        }

        binding.buttonI.setOnClickListener {
            binding.huruf.text = "Ii"
            binding.bahasaInggris.text = "Ice cream"
            binding.bahasaIndo.text = "Cây Kem"
            binding.gambar.setImageResource(R.mipmap.i)
            soundOn()

            binding.buttonI.setBackgroundResource(R.drawable.clickedalfabeth)
            binding.buttonI.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(resources.getColor(R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(resources.getColor(R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(resources.getColor(R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(resources.getColor(R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(resources.getColor(R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(resources.getColor(R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(resources.getColor(R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(resources.getColor(R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(resources.getColor(R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(resources.getColor(R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(resources.getColor(R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(resources.getColor(R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(resources.getColor(R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(resources.getColor(R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(resources.getColor(R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(resources.getColor(R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(resources.getColor(R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(resources.getColor(R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(resources.getColor(R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(resources.getColor(R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(resources.getColor(R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(resources.getColor(R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(resources.getColor(R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(resources.getColor(R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(resources.getColor(R.color.white))
        }

        binding.buttonJ.setOnClickListener {
            binding.huruf.text = "Jj"
            binding.bahasaInggris.text = "Jar"
            binding.bahasaIndo.text = "Cái lọ"
            binding.gambar.setImageResource(R.mipmap.j)
            soundOn()

            binding.buttonJ.setBackgroundResource(R.drawable.clickedalfabeth)
            binding.buttonJ.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(resources.getColor(R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(resources.getColor(R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(resources.getColor(R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(resources.getColor(R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(resources.getColor(R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(resources.getColor(R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(resources.getColor(R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(resources.getColor(R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(resources.getColor(R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(resources.getColor(R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(resources.getColor(R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(resources.getColor(R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(resources.getColor(R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(resources.getColor(R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(resources.getColor(R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(resources.getColor(R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(resources.getColor(R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(resources.getColor(R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(resources.getColor(R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(resources.getColor(R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(resources.getColor(R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(resources.getColor(R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(resources.getColor(R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(resources.getColor(R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(resources.getColor(R.color.white))
        }

        binding.buttonK.setOnClickListener {
            binding.huruf.text = "Kk"
            binding.bahasaInggris.text = "Kite"
            binding.bahasaIndo.text = "Con Diều"
            binding.gambar.setImageResource(R.mipmap.k)
            soundOn()

            binding.buttonK.setBackgroundResource(R.drawable.clickedalfabeth)
            binding.buttonK.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(resources.getColor(R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(resources.getColor(R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(resources.getColor(R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(resources.getColor(R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(resources.getColor(R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(resources.getColor(R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(resources.getColor(R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(resources.getColor(R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(resources.getColor(R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(resources.getColor(R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(resources.getColor(R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(resources.getColor(R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(resources.getColor(R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(resources.getColor(R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(resources.getColor(R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(resources.getColor(R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(resources.getColor(R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(resources.getColor(R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(resources.getColor(R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(resources.getColor(R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(resources.getColor(R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(resources.getColor(R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(resources.getColor(R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(resources.getColor(R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(resources.getColor(R.color.white))
        }

        binding.buttonL.setOnClickListener {
            binding.huruf.text = "Ll"
            binding.bahasaInggris.text = "Ladder"
            binding.bahasaIndo.text = "Thang"
            binding.gambar.setImageResource(R.mipmap.l)
            soundOn()

            binding.buttonL.setBackgroundResource(R.drawable.clickedalfabeth)
            binding.buttonL.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(resources.getColor(R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(resources.getColor(R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(resources.getColor(R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(resources.getColor(R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(resources.getColor(R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(resources.getColor(R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(resources.getColor(R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(resources.getColor(R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(resources.getColor(R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(resources.getColor(R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(resources.getColor(R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(resources.getColor(R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(resources.getColor(R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(resources.getColor(R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(resources.getColor(R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(resources.getColor(R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(resources.getColor(R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(resources.getColor(R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(resources.getColor(R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(resources.getColor(R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(resources.getColor(R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(resources.getColor(R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(resources.getColor(R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(resources.getColor(R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(resources.getColor(R.color.white))
        }

        binding.buttonM.setOnClickListener {
            binding.huruf.text = "Mm"
            binding.bahasaInggris.text = "Mango"
            binding.bahasaIndo.text = "Quả Xoài"
            binding.gambar.setImageResource(R.mipmap.m)
            soundOn()

            binding.buttonM.setBackgroundResource(R.drawable.clickedalfabeth)
            binding.buttonM.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(resources.getColor(R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(resources.getColor(R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(resources.getColor(R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(resources.getColor(R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(resources.getColor(R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(resources.getColor(R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(resources.getColor(R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(resources.getColor(R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(resources.getColor(R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(resources.getColor(R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(resources.getColor(R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(resources.getColor(R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(resources.getColor(R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(resources.getColor(R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(resources.getColor(R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(resources.getColor(R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(resources.getColor(R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(resources.getColor(R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(resources.getColor(R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(resources.getColor(R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(resources.getColor(R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(resources.getColor(R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(resources.getColor(R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(resources.getColor(R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(resources.getColor(R.color.white))
        }

        binding.buttonN.setOnClickListener {
            binding.huruf.text = "Nn"
            binding.bahasaInggris.text = "Nest"
            binding.bahasaIndo.text = "Cái Tổ"
            binding.gambar.setImageResource(R.mipmap.n)
            soundOn()

            binding.buttonN.setBackgroundResource(R.drawable.clickedalfabeth)
            binding.buttonN.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(resources.getColor(R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(resources.getColor(R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(resources.getColor(R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(resources.getColor(R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(resources.getColor(R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(resources.getColor(R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(resources.getColor(R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(resources.getColor(R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(resources.getColor(R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(resources.getColor(R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(resources.getColor(R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(resources.getColor(R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(resources.getColor(R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(resources.getColor(R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(resources.getColor(R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(resources.getColor(R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(resources.getColor(R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(resources.getColor(R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(resources.getColor(R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(resources.getColor(R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(resources.getColor(R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(resources.getColor(R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(resources.getColor(R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(resources.getColor(R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(resources.getColor(R.color.white))
        }

        binding.buttonO.setOnClickListener {
            binding.huruf.text = "Oo"
            binding.bahasaInggris.text = "Owl"
            binding.bahasaIndo.text = "Con cú"
            binding.gambar.setImageResource(R.mipmap.o)
            soundOn()

            binding.buttonO.setBackgroundResource(R.drawable.clickedalfabeth)
            binding.buttonO.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(resources.getColor(R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(resources.getColor(R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(resources.getColor(R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(resources.getColor(R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(resources.getColor(R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(resources.getColor(R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(resources.getColor(R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(resources.getColor(R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(resources.getColor(R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(resources.getColor(R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(resources.getColor(R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(resources.getColor(R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(resources.getColor(R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(resources.getColor(R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(resources.getColor(R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(resources.getColor(R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(resources.getColor(R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(resources.getColor(R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(resources.getColor(R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(resources.getColor(R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(resources.getColor(R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(resources.getColor(R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(resources.getColor(R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(resources.getColor(R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(resources.getColor(R.color.white))
        }

        binding.buttonP.setOnClickListener {
            binding.huruf.text = "Pp"
            binding.bahasaInggris.text = "Panda"
            binding.bahasaIndo.text = "Gấu Trúc"
            binding.gambar.setImageResource(R.mipmap.p)
            soundOn()

            binding.buttonP.setBackgroundResource(R.drawable.clickedalfabeth)
            binding.buttonP.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(resources.getColor(R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(resources.getColor(R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(resources.getColor(R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(resources.getColor(R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(resources.getColor(R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(resources.getColor(R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(resources.getColor(R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(resources.getColor(R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(resources.getColor(R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(resources.getColor(R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(resources.getColor(R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(resources.getColor(R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(resources.getColor(R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(resources.getColor(R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(resources.getColor(R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(resources.getColor(R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(resources.getColor(R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(resources.getColor(R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(resources.getColor(R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(resources.getColor(R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(resources.getColor(R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(resources.getColor(R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(resources.getColor(R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(resources.getColor(R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(resources.getColor(R.color.white))
        }

        binding.buttonQ.setOnClickListener {
            binding.huruf.text = "Qq"
            binding.bahasaInggris.text = "Queen"
            binding.bahasaIndo.text = "Nữ hoàng"
            binding.gambar.setImageResource(R.mipmap.q)
            soundOn()

            binding.buttonQ.setBackgroundResource(R.drawable.clickedalfabeth)
            binding.buttonQ.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(resources.getColor(R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(resources.getColor(R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(resources.getColor(R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(resources.getColor(R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(resources.getColor(R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(resources.getColor(R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(resources.getColor(R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(resources.getColor(R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(resources.getColor(R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(resources.getColor(R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(resources.getColor(R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(resources.getColor(R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(resources.getColor(R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(resources.getColor(R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(resources.getColor(R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(resources.getColor(R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(resources.getColor(R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(resources.getColor(R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(resources.getColor(R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(resources.getColor(R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(resources.getColor(R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(resources.getColor(R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(resources.getColor(R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(resources.getColor(R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(resources.getColor(R.color.white))
        }

        binding.buttonR.setOnClickListener {
            binding.huruf.text = "Rr"
            binding.bahasaInggris.text = "Rabbit"
            binding.bahasaIndo.text = "Con Thỏ"
            binding.gambar.setImageResource(R.mipmap.r)
            soundOn()

            binding.buttonR.setBackgroundResource(R.drawable.clickedalfabeth)
            binding.buttonR.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(resources.getColor(R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(resources.getColor(R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(resources.getColor(R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(resources.getColor(R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(resources.getColor(R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(resources.getColor(R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(resources.getColor(R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(resources.getColor(R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(resources.getColor(R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(resources.getColor(R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(resources.getColor(R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(resources.getColor(R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(resources.getColor(R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(resources.getColor(R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(resources.getColor(R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(resources.getColor(R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(resources.getColor(R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(resources.getColor(R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(resources.getColor(R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(resources.getColor(R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(resources.getColor(R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(resources.getColor(R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(resources.getColor(R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(resources.getColor(R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(resources.getColor(R.color.white))
        }

        binding.buttonS.setOnClickListener {
            binding.huruf.text = "Ss"
            binding.bahasaInggris.text = "Socks"
            binding.bahasaIndo.text = "Vớ"
            binding.gambar.setImageResource(R.mipmap.s)
            soundOn()

            binding.buttonS.setBackgroundResource(R.drawable.clickedalfabeth)
            binding.buttonS.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(resources.getColor(R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(resources.getColor(R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(resources.getColor(R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(resources.getColor(R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(resources.getColor(R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(resources.getColor(R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(resources.getColor(R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(resources.getColor(R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(resources.getColor(R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(resources.getColor(R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(resources.getColor(R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(resources.getColor(R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(resources.getColor(R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(resources.getColor(R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(resources.getColor(R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(resources.getColor(R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(resources.getColor(R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(resources.getColor(R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(resources.getColor(R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(resources.getColor(R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(resources.getColor(R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(resources.getColor(R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(resources.getColor(R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(resources.getColor(R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(resources.getColor(R.color.white))
        }

        binding.buttonT.setOnClickListener {
            binding.huruf.text = "Tt"
            binding.bahasaInggris.text = "Turtle"
            binding.bahasaIndo.text = "Con Rùa"
            binding.gambar.setImageResource(R.mipmap.t)
            soundOn()

            binding.buttonT.setBackgroundResource(R.drawable.clickedalfabeth)
            binding.buttonT.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(resources.getColor(R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(resources.getColor(R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(resources.getColor(R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(resources.getColor(R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(resources.getColor(R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(resources.getColor(R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(resources.getColor(R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(resources.getColor(R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(resources.getColor(R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(resources.getColor(R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(resources.getColor(R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(resources.getColor(R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(resources.getColor(R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(resources.getColor(R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(resources.getColor(R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(resources.getColor(R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(resources.getColor(R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(resources.getColor(R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(resources.getColor(R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(resources.getColor(R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(resources.getColor(R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(resources.getColor(R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(resources.getColor(R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(resources.getColor(R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(resources.getColor(R.color.white))
        }

        binding.buttonU.setOnClickListener {
            binding.huruf.text = "Uu"
            binding.bahasaInggris.text = "Umbrella"
            binding.bahasaIndo.text = "Cây Dù"
            binding.gambar.setImageResource(R.mipmap.u)
            soundOn()

            binding.buttonU.setBackgroundResource(R.drawable.clickedalfabeth)
            binding.buttonU.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(resources.getColor(R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(resources.getColor(R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(resources.getColor(R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(resources.getColor(R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(resources.getColor(R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(resources.getColor(R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(resources.getColor(R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(resources.getColor(R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(resources.getColor(R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(resources.getColor(R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(resources.getColor(R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(resources.getColor(R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(resources.getColor(R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(resources.getColor(R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(resources.getColor(R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(resources.getColor(R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(resources.getColor(R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(resources.getColor(R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(resources.getColor(R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(resources.getColor(R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(resources.getColor(R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(resources.getColor(R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(resources.getColor(R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(resources.getColor(R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(resources.getColor(R.color.white))
        }

        binding.buttonV.setOnClickListener {
            binding.huruf.text = "Vv"
            binding.bahasaInggris.text = "Volleyball"
            binding.bahasaIndo.text = "Bóng chuyền"
            binding.gambar.setImageResource(R.mipmap.v)
            soundOn()

            binding.buttonV.setBackgroundResource(R.drawable.clickedalfabeth)
            binding.buttonV.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(resources.getColor(R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(resources.getColor(R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(resources.getColor(R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(resources.getColor(R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(resources.getColor(R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(resources.getColor(R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(resources.getColor(R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(resources.getColor(R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(resources.getColor(R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(resources.getColor(R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(resources.getColor(R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(resources.getColor(R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(resources.getColor(R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(resources.getColor(R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(resources.getColor(R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(resources.getColor(R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(resources.getColor(R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(resources.getColor(R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(resources.getColor(R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(resources.getColor(R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(resources.getColor(R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(resources.getColor(R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(resources.getColor(R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(resources.getColor(R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(resources.getColor(R.color.white))
        }

        binding.buttonW.setOnClickListener {
            binding.huruf.text = "Ww"
            binding.bahasaInggris.text = "Wolf"
            binding.bahasaIndo.text = "Chó sói"
            binding.gambar.setImageResource(R.mipmap.w)
            soundOn()

            binding.buttonW.setBackgroundResource(R.drawable.clickedalfabeth)
            binding.buttonW.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(resources.getColor(R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(resources.getColor(R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(resources.getColor(R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(resources.getColor(R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(resources.getColor(R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(resources.getColor(R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(resources.getColor(R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(resources.getColor(R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(resources.getColor(R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(resources.getColor(R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(resources.getColor(R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(resources.getColor(R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(resources.getColor(R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(resources.getColor(R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(resources.getColor(R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(resources.getColor(R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(resources.getColor(R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(resources.getColor(R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(resources.getColor(R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(resources.getColor(R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(resources.getColor(R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(resources.getColor(R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(resources.getColor(R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(resources.getColor(R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(resources.getColor(R.color.white))
        }

        binding.buttonX.setOnClickListener {
            binding.huruf.text = "Xx"
            binding.bahasaInggris.text = "Xylophone"
            binding.bahasaIndo.text = "đàn xylophone"
            binding.gambar.setImageResource(R.mipmap.x)
            soundOn()

            binding.buttonX.setBackgroundResource(R.drawable.clickedalfabeth)
            binding.buttonX.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(resources.getColor(R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(resources.getColor(R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(resources.getColor(R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(resources.getColor(R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(resources.getColor(R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(resources.getColor(R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(resources.getColor(R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(resources.getColor(R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(resources.getColor(R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(resources.getColor(R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(resources.getColor(R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(resources.getColor(R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(resources.getColor(R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(resources.getColor(R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(resources.getColor(R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(resources.getColor(R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(resources.getColor(R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(resources.getColor(R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(resources.getColor(R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(resources.getColor(R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(resources.getColor(R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(resources.getColor(R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(resources.getColor(R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(resources.getColor(R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(resources.getColor(R.color.white))
        }

        binding.buttonY.setOnClickListener {
            binding.huruf.text = "Yy"
            binding.bahasaInggris.text = "Yoyo"
            binding.bahasaIndo.text = "Yoyo"
            binding.gambar.setImageResource(R.mipmap.y)
            soundOn()

            binding.buttonY.setBackgroundResource(R.drawable.clickedalfabeth)
            binding.buttonY.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(resources.getColor(R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(resources.getColor(R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(resources.getColor(R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(resources.getColor(R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(resources.getColor(R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(resources.getColor(R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(resources.getColor(R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(resources.getColor(R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(resources.getColor(R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(resources.getColor(R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(resources.getColor(R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(resources.getColor(R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(resources.getColor(R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(resources.getColor(R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(resources.getColor(R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(resources.getColor(R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(resources.getColor(R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(resources.getColor(R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(resources.getColor(R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(resources.getColor(R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(resources.getColor(R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(resources.getColor(R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(resources.getColor(R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(resources.getColor(R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(resources.getColor(R.color.white))
        }

        binding.buttonZ.setOnClickListener {
            binding.huruf.text = "Zz"
            binding.bahasaInggris.text = "Zebra"
            binding.bahasaIndo.text = "Ngựa vằn"
            binding.gambar.setImageResource(R.mipmap.z)
            soundOn()

            binding.buttonZ.setBackgroundResource(R.drawable.clickedalfabeth)
            binding.buttonZ.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(resources.getColor(R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(resources.getColor(R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(resources.getColor(R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(resources.getColor(R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(resources.getColor(R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(resources.getColor(R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(resources.getColor(R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(resources.getColor(R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(resources.getColor(R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(resources.getColor(R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(resources.getColor(R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(resources.getColor(R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(resources.getColor(R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(resources.getColor(R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(resources.getColor(R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(resources.getColor(R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(resources.getColor(R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(resources.getColor(R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(resources.getColor(R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(resources.getColor(R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(resources.getColor(R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(resources.getColor(R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(resources.getColor(R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(resources.getColor(R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(resources.getColor(R.color.white))
        }
    }

    private fun soundOn() {
        when (binding.huruf.text) {
            "Aa" -> {
                val player = MediaPlayer.create(this, R.raw.a)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Bb" -> {
                val player = MediaPlayer.create(this, R.raw.b)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Cc" -> {
                val player = MediaPlayer.create(this, R.raw.c)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Dd" -> {
                val player = MediaPlayer.create(this, R.raw.d)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Ee" -> {
                val player = MediaPlayer.create(this, R.raw.e)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Ff" -> {
                val player = MediaPlayer.create(this, R.raw.f)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Gg" -> {
                val player = MediaPlayer.create(this, R.raw.g)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Hh" -> {
                val player = MediaPlayer.create(this, R.raw.h)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Ii" -> {
                val player = MediaPlayer.create(this, R.raw.i)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Jj" -> {
                val player = MediaPlayer.create(this, R.raw.j)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Kk" -> {
                val player = MediaPlayer.create(this, R.raw.k)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Ll" -> {
                val player = MediaPlayer.create(this, R.raw.l)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Mm" -> {
                val player = MediaPlayer.create(this, R.raw.m)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Nn" -> {
                val player = MediaPlayer.create(this, R.raw.n)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Oo" -> {
                val player = MediaPlayer.create(this, R.raw.o)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Pp" -> {
                val player = MediaPlayer.create(this, R.raw.p)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Qq" -> {
                val player = MediaPlayer.create(this, R.raw.q)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Rr" -> {
                val player = MediaPlayer.create(this, R.raw.r)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Ss" -> {
                val player = MediaPlayer.create(this, R.raw.s)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Tt" -> {
                val player = MediaPlayer.create(this, R.raw.t)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Uu" -> {
                val player = MediaPlayer.create(this, R.raw.u)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Vv" -> {
                val player = MediaPlayer.create(this, R.raw.v)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Ww" -> {
                val player = MediaPlayer.create(this, R.raw.w)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Xx" -> {
                val player = MediaPlayer.create(this, R.raw.x)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Yy" -> {
                val player = MediaPlayer.create(this, R.raw.y)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            else -> {
                val player = MediaPlayer.create(this, R.raw.z)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
    }
}