package com.nhinhnguyenuit.studyenglishforkids

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.nhinhnguyenuit.studyenglishforkids.databinding.ActivityQuizBinding

class Quiz : AppCompatActivity() {

    private lateinit var binding: ActivityQuizBinding
    lateinit var dialog: Dialog
    lateinit var buttonYes: Button
    lateinit var buttonNo: Button
    lateinit var buttonX: ImageButton

    var questions = arrayOf(
        "1. Màu đỏ trong tiếng Anh là gì?",
        "2. Từ tiếng Anh dành cho mèo là gì?",
        "3. Cách viết đúng của từ cà rốt trong tiếng Anh là gì?",
        "4. \"Vàng\" và \"đỏ\" khi trộn lẫn sẽ tạo ra màu?",
        "5. Cách viết đúng là?",
        "6. Màu xanh lá cây là sự pha trộn của nhiều màu sắc?",
        "7. Những loại trái cây bắt đầu bằng chữ A trong tiếng Anh là gì?",
        "8. Trong tiếng Anh, hoa hướng dương có màu gì?",
        "9. Trong tiếng Anh, rau thường có màu?",
        "10. Từ tiếng Anh cho màu tím là?",
        "11. Bắp cải có nghĩa là gì trong tiếng Anh?",
        "12. Ngựa vằn có màu gì?",
        "13. Từ Xe hơi tiếng Anh là gì?",
        "14. Quốc kỳ Việt Nam có màu gì?",
        "15. Từ cá heo Trong tiếng anh là gì ?"
    )
    var answers = arrayOf(
        "Red",
        "Cat",
        "Carrot",
        "Orange",
        "Xylophone",
        "Blue and Yellow",
        "Apple",
        "Yellow",
        "Green",
        "Purple",
        "Kol",
        "White and Black",
        "Car",
        "Red & Yellow",
        "Dolphin"
    )
    var opt = arrayOf(
        "Red", "Black", "Pink", "Orange",
        "Dinosaur", "Eagle", "Dog", "Cat",
        "Carrot", "Caarot", "Carot", "Caroot",
        "Green", "Black", "Brown", "Orange",
        "Xylophone", "Xilophone", "Xilofone", "Xylofone",
        "White & Blue", "Blue & Red", "Blue & Yellow", "Yellow & Red",
        "Mango", "Carrot", "Banana", "Apple",
        "Yellow", "Black", "Red", "White",
        "Red", "Yellow", "Green", "White",
        "Blue", "Yellow", "Red", "Purple",
        "Cabbage", "Carrots", "Beans", "Broccoli",
        "White & Black", "Black & Red", "Black & Grey", "White & Blue",
        "Car", "Motorcycle", "Airplane", "Boat",
        "Blue & Red", "Red & Yellow", "White & Blue", "Red & White",
        "Cat", "Dolphin", "Giraffe", "Elephant"
    )

    var flag = 0
    var marks: Int = 0
    var correct: Int = 0
    var ans: String = ""
    var no = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dialog = Dialog(this)

        val level = intent.getStringExtra("Level").toString()
        if (level == "1") {
            binding.nomorlevel.text = "/5"
        } else if (level == "2") {
            binding.nomorlevel.text = "/10"
        } else {
            binding.nomorlevel.text = "/15"
        }
        binding.textView7.text = no.toString()

        binding.soal.text = questions[flag]
        binding.optionA.text = opt[0]
        binding.optionB.text = opt[1]
        binding.optionC.text = opt[2]
        binding.optionD.text = opt[3]

        binding.buttonjawabA.setOnClickListener {
            ans = binding.optionA.text.toString()
            binding.buttona.setBackgroundResource(R.drawable.circlegreen)
            binding.buttona.setTextColor(resources.getColor(R.color.colorPrimaryDark))
//
            binding.buttonb.setBackgroundResource(R.drawable.circlepurple)
            binding.buttonb.setTextColor(resources.getColor(R.color.white))

            binding.buttonc.setBackgroundResource(R.drawable.circlepurple)
            binding.buttonc.setTextColor(resources.getColor(R.color.white))

            binding.buttond.setBackgroundResource(R.drawable.circlepurple)
            binding.buttond.setTextColor(resources.getColor(R.color.white))
        }
        binding.buttonjawabB.setOnClickListener {
            ans = binding.optionB.text.toString()

            binding.buttonb.setBackgroundResource(R.drawable.circlegreen)
            binding.buttonb.setTextColor(resources.getColor(R.color.colorPrimaryDark))
//
            binding.buttona.setBackgroundResource(R.drawable.circlepurple)
            binding.buttona.setTextColor(resources.getColor(R.color.white))

            binding.buttonc.setBackgroundResource(R.drawable.circlepurple)
            binding.buttonc.setTextColor(resources.getColor(R.color.white))

            binding.buttond.setBackgroundResource(R.drawable.circlepurple)
            binding.buttond.setTextColor(resources.getColor(R.color.white))
        }
        binding.buttonjawabC.setOnClickListener {
            ans = binding.optionC.text.toString()

            binding.buttonc.setBackgroundResource(R.drawable.circlegreen)
            binding.buttonc.setTextColor(resources.getColor(R.color.colorPrimaryDark))
//
            binding.buttonb.setBackgroundResource(R.drawable.circlepurple)
            binding.buttonb.setTextColor(resources.getColor(R.color.white))

            binding.buttona.setBackgroundResource(R.drawable.circlepurple)
            binding.buttona.setTextColor(resources.getColor(R.color.white))

            binding.buttond.setBackgroundResource(R.drawable.circlepurple)
            binding.buttond.setTextColor(resources.getColor(R.color.white))
        }
        binding.buttonjawabD.setOnClickListener {
            ans = binding.optionD.text.toString()

            binding.buttond.setBackgroundResource(R.drawable.circlegreen)
            binding.buttond.setTextColor(resources.getColor(R.color.colorPrimaryDark))
//
            binding.buttonb.setBackgroundResource(R.drawable.circlepurple)
            binding.buttonb.setTextColor(resources.getColor(R.color.white))

            binding.buttonc.setBackgroundResource(R.drawable.circlepurple)
            binding.buttonc.setTextColor(resources.getColor(R.color.white))

            binding.buttona.setBackgroundResource(R.drawable.circlepurple)
            binding.buttona.setTextColor(resources.getColor(R.color.white))
        }

        binding.buttonback.setOnClickListener {
            onBackPressed()
        }

        binding.next.setOnClickListener {
            if (ans == "") {
                Toast.makeText(this, "SELECT ONE BUTTON", Toast.LENGTH_SHORT).show()
            } else if (ans == answers[flag]) {
                correct++
            }

            if (ans != "") {
                flag++
                ans = ""
                if (level == "1" && flag == 5) {
                    marks = correct * 20
                    val intent = Intent(this, Result::class.java)
                    intent.putExtra("mark", marks)
                    intent.putExtra("level", "1")
                    startActivity(intent)
                    finish()
                } else if (level == "2" && flag == 10) {
                    marks = correct * 10
                    val intent = Intent(this, Result::class.java)
                    intent.putExtra("mark", marks)
                    intent.putExtra("level", "2")
                    startActivity(intent)
                    finish()
                } else if (level == "3" && flag == 15) {
                    marks = (correct * 6) + 10
                    val intent = Intent(this, Result::class.java)
                    intent.putExtra("mark", marks)
                    intent.putExtra("level", "3")
                    startActivity(intent)
                    finish()
                } else {
                    binding.soal.text = questions[flag]
                    binding.optionA.text = opt[flag * 4]
                    binding.optionB.text = opt[flag * 4 + 1]
                    binding.optionC.text = opt[flag * 4 + 2]
                    binding.optionD.text = opt[flag * 4 + 3]
                    binding.textView7.text = no++.toString()
                    clear()
                }
            }
        }

    }

    fun clear() {
        binding.buttona.setBackgroundResource(R.drawable.circlepurple)
        binding.buttona.setTextColor(resources.getColor(R.color.white))

        binding.buttonb.setBackgroundResource(R.drawable.circlepurple)
        binding.buttonb.setTextColor(resources.getColor(R.color.white))

        binding.buttonc.setBackgroundResource(R.drawable.circlepurple)
        binding.buttonc.setTextColor(resources.getColor(R.color.white))

        binding.buttond.setBackgroundResource(R.drawable.circlepurple)
        binding.buttond.setTextColor(resources.getColor(R.color.white))
    }

    override fun onBackPressed() {
        dialog.setContentView(R.layout.alertdialog)
        buttonYes = dialog.findViewById(R.id.button_ya)
        buttonNo = dialog.findViewById(R.id.button_tidak)
        buttonX = dialog.findViewById(R.id.button_x)
        buttonYes.setOnClickListener {
            super.onBackPressed()
            finish()
        }
        buttonNo.setOnClickListener {
            dialog.dismiss()
        }
        buttonX.setOnClickListener {
            dialog.dismiss()
        }
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show()
    }

}