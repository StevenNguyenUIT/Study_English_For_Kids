package com.nhinhnguyenuit.studyenglishforkids

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nhinhnguyenuit.studyenglishforkids.databinding.ActivityResultBinding

class Result : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mark = intent.getIntExtra("mark", 0)
        val level = intent.getStringExtra("level")

        if (mark <= 60){
            binding.predikat.text = "điểm bài kiểm tra của bạn vẫn còn quá nhỏ :("
        }
        else {
            binding.predikat.text = "Chúc mừng! Điểm bài kiểm tra của bạn..."
        }

        when (level) {
            "1" -> {
                binding.textlevel.text = "Beginner Level"
            }
            "2" -> {
                binding.textlevel.text = "Advanced Level"
            }
            else -> {
                binding.textlevel.text = "Professional Level"
            }
        }

        val result = mark.toString()

        binding.grade.text = "$result/100"
        binding.shareButton.setOnClickListener {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "Wow, điểm của tôi đã được kiểm tra bởi StevenNguyen $result, Nào, hãy tải xuống ứng dụng ngay trên Play Store!")
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, "Chia sẻ với...")
            startActivity(shareIntent)
        }

        binding.back.setOnClickListener {
            finish()
        }

    }
}
