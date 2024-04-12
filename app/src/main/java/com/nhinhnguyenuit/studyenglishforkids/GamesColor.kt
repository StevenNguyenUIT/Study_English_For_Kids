package com.nhinhnguyenuit.studyenglishforkids

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import com.nhinhnguyenuit.studyenglishforkids.databinding.ActivityGamesColorBinding

class GamesColor : AppCompatActivity() {

    private lateinit var binding: ActivityGamesColorBinding


    private lateinit var popup: Dialog
    private lateinit var popupbutton: ImageButton
    private lateinit var popuptext: TextView
    lateinit var player: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_games_color)

        binding = ActivityGamesColorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        popup = Dialog(this)

        binding.buttonback.setOnClickListener {
            onBackPressed()
        }

        binding.buttonHelp.setOnClickListener {
            popup.setContentView(R.layout.helpdialog)
            popupbutton = popup.findViewById(R.id.button_xhelp)
            popuptext = popup.findViewById(R.id.help)
            popuptext.text =
                "Chọn một màu trên bảng màu sau đó nhấn Trộn màu để xem kết quả trộn các màu đã chọn"
            popupbutton.setOnClickListener {
                popup.dismiss()
            }
            popup.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            popup.show()
        }

        binding.kuning.setOnClickListener {
            if (binding.satu.text == "So Mot") {
                binding.satu.text = "1"
                binding.satu.setBackgroundResource(R.drawable.kuning)
                binding.kuning.setImageResource(R.drawable.ceklis)
            } else if (binding.dua.text == "So Hai" && binding.satu.text != "1") {
                binding.dua.text = "1"
                binding.dua.setBackgroundResource(R.drawable.kuning)
                binding.kuning.setImageResource(R.drawable.ceklis)
            } else if (binding.tiga.text == "So Ba" && binding.satu.text != "1" && binding.dua.text != "1") {
                binding.tiga.text = "1"
                binding.tiga.setBackgroundResource(R.drawable.kuning)
                binding.kuning.setImageResource(R.drawable.ceklis)
            }
        }

        binding.biru.setOnClickListener {
            if (binding.satu.text == "So Mot") {
                binding.satu.text = "2"
                binding.satu.setBackgroundResource(R.drawable.biru)
                binding.biru.setImageResource(R.drawable.ceklis)
            } else if (binding.dua.text == "So Hai" && binding.satu.text != "2") {
                binding.dua.text = "2"
                binding.dua.setBackgroundResource(R.drawable.biru)
                binding.biru.setImageResource(R.drawable.ceklis)
            } else if (binding.tiga.text == "So Ba" && binding.satu.text != "2" && binding.dua.text != "2") {
                binding.tiga.text = "2"
                binding.tiga.setBackgroundResource(R.drawable.biru)
                binding.biru.setImageResource(R.drawable.ceklis)
            }
        }

        binding.merah.setOnClickListener {
            if (binding.satu.text == "So Mot") {
                binding.satu.text = "3"
                binding.satu.setBackgroundResource(R.drawable.merah)
                binding.merah.setImageResource(R.drawable.ceklis)
            } else if (binding.dua.text == "So Hai" && binding.satu.text != "3") {
                binding.dua.text = "3"
                binding.dua.setBackgroundResource(R.drawable.merah)
                binding.merah.setImageResource(R.drawable.ceklis)
            } else if (binding.tiga.text == "So Ba" && binding.satu.text != "3" && binding.dua.text != "3") {
                binding.tiga.text = "3"
                binding.tiga.setBackgroundResource(R.drawable.merah)
                binding.merah.setImageResource(R.drawable.ceklis)
            }
        }

        binding.hitam.setOnClickListener {
            if (binding.satu.text == "So Mot") {
                binding.satu.text = "4"
                binding.satu.setBackgroundResource(R.drawable.hitam)
                binding.hitam.setImageResource(R.drawable.ceklis)
            } else if (binding.dua.text == "So Hai" && binding.satu.text != "4") {
                binding.dua.text = "4"
                binding.dua.setBackgroundResource(R.drawable.hitam)
                binding.hitam.setImageResource(R.drawable.ceklis)
            } else if (binding.tiga.text == "So Ba" && binding.satu.text != "4" && binding.dua.text != "4") {
                binding.tiga.text = "4"
                binding.tiga.setBackgroundResource(R.drawable.hitam)
                binding.hitam.setImageResource(R.drawable.ceklis)
            }
        }

        binding.putih.setOnClickListener {
            if (binding.satu.text == "So Mot") {
                binding.satu.text = "5"
                binding.satu.setBackgroundResource(R.drawable.putih)
                binding.putih.setImageResource(R.drawable.ceklis)
            } else if (binding.dua.text == "So Hai" && binding.satu.text != "5") {
                binding.dua.text = "5"
                binding.dua.setBackgroundResource(R.drawable.putih)
                binding.putih.setImageResource(R.drawable.ceklis)
            } else if (binding.tiga.text == "So Ba" && binding.satu.text != "5" && binding.dua.text != "5") {
                binding.tiga.text = "5"
                binding.tiga.setBackgroundResource(R.drawable.putih)
                binding.putih.setImageResource(R.drawable.ceklis)
            }
        }
//
        binding.satu.setOnClickListener {
            if (binding.satu.text == "1") {
                if (binding.dua.text != "So Hai") {
                    if (binding.dua.text == "2") {
                        if (binding.tiga.text != "So Ba") {
                            if (binding.tiga.text == "3") {
                                binding.satu.setBackgroundResource(R.drawable.biru)
                                binding.satu.text = "2"
                                binding.dua.setBackgroundResource(R.drawable.merah)
                                binding.dua.text = "3"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "4") {
                                binding.satu.setBackgroundResource(R.drawable.biru)
                                binding.satu.text = "2"
                                binding.dua.setBackgroundResource(R.drawable.hitam)
                                binding.dua.text = "4"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "5") {
                                binding.satu.setBackgroundResource(R.drawable.biru)
                                binding.satu.text = "2"
                                binding.dua.setBackgroundResource(R.drawable.putih)
                                binding.dua.text = "5"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                        } else {
                            binding.satu.setBackgroundResource(R.drawable.biru)
                            binding.satu.text = "2"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "So Hai"
                        }
                    } else if (binding.dua.text == "3") {
                        if (binding.tiga.text != "So Ba") {
                            if (binding.tiga.text == "2") {
                                binding.satu.setBackgroundResource(R.drawable.merah)
                                binding.satu.text = "3"
                                binding.dua.setBackgroundResource(R.drawable.biru)
                                binding.dua.text = "2"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "4") {
                                binding.satu.setBackgroundResource(R.drawable.merah)
                                binding.satu.text = "3"
                                binding.dua.setBackgroundResource(R.drawable.hitam)
                                binding.dua.text = "4"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "5") {
                                binding.satu.setBackgroundResource(R.drawable.merah)
                                binding.satu.text = "3"
                                binding.dua.setBackgroundResource(R.drawable.putih)
                                binding.dua.text = "5"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                        } else {
                            binding.satu.setBackgroundResource(R.drawable.merah)
                            binding.satu.text = "3"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "So Hai"
                        }
                    } else if (binding.dua.text == "4") {
                        if (binding.tiga.text != "So Ba") {
                            if (binding.tiga.text == "2") {
                                binding.satu.setBackgroundResource(R.drawable.hitam)
                                binding.satu.text = "4"
                                binding.dua.setBackgroundResource(R.drawable.biru)
                                binding.dua.text = "2"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "3") {
                                binding.satu.setBackgroundResource(R.drawable.hitam)
                                binding.satu.text = "4"
                                binding.dua.setBackgroundResource(R.drawable.merah)
                                binding.dua.text = "3"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "5") {
                                binding.satu.setBackgroundResource(R.drawable.hitam)
                                binding.satu.text = "4"
                                binding.dua.setBackgroundResource(R.drawable.putih)
                                binding.dua.text = "5"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                        } else {
                            binding.satu.setBackgroundResource(R.drawable.hitam)
                            binding.satu.text = "4"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "So Hai"
                        }
                    } else if (binding.dua.text == "5") {
                        if (binding.tiga.text != "So Ba") {
                            if (binding.tiga.text == "2") {
                                binding.satu.setBackgroundResource(R.drawable.putih)
                                binding.satu.text = "5"
                                binding.dua.setBackgroundResource(R.drawable.biru)
                                binding.dua.text = "2"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "3") {
                                binding.satu.setBackgroundResource(R.drawable.putih)
                                binding.satu.text = "5"
                                binding.dua.setBackgroundResource(R.drawable.merah)
                                binding.dua.text = "3"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "4") {
                                binding.satu.setBackgroundResource(R.drawable.putih)
                                binding.satu.text = "5"
                                binding.dua.setBackgroundResource(R.drawable.hitam)
                                binding.dua.text = "4"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                        } else {
                            binding.satu.setBackgroundResource(R.drawable.putih)
                            binding.satu.text = "5"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "So Hai"
                        }
                    }
                } else {
                    binding.satu.setBackgroundResource(R.drawable.buttonmixcolor)
                    binding.satu.text = "So Mot"
                }
                binding.kuning.setImageResource(0)
            } else if (binding.satu.text == "2") {
                if (binding.dua.text != "So Hai") {
                    if (binding.dua.text == "1") {
                        if (binding.tiga.text != "So Ba") {
                            if (binding.tiga.text == "3") {
                                binding.satu.setBackgroundResource(R.drawable.kuning)
                                binding.satu.text = "1"
                                binding.dua.setBackgroundResource(R.drawable.merah)
                                binding.dua.text = "3"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "4") {
                                binding.satu.setBackgroundResource(R.drawable.kuning)
                                binding.satu.text = "1"
                                binding.dua.setBackgroundResource(R.drawable.hitam)
                                binding.dua.text = "4"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "5") {
                                binding.satu.setBackgroundResource(R.drawable.kuning)
                                binding.satu.text = "1"
                                binding.dua.setBackgroundResource(R.drawable.putih)
                                binding.dua.text = "5"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                        } else {
                            binding.satu.setBackgroundResource(R.drawable.kuning)
                            binding.satu.text = "1"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "So Hai"
                        }
                    } else if (binding.dua.text == "3") {
                        if (binding.tiga.text != "So Ba") {
                            if (binding.tiga.text == "1") {
                                binding.satu.setBackgroundResource(R.drawable.merah)
                                binding.satu.text = "3"
                                binding.dua.setBackgroundResource(R.drawable.kuning)
                                binding.dua.text = "1"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "4") {
                                binding.satu.setBackgroundResource(R.drawable.merah)
                                binding.satu.text = "3"
                                binding.dua.setBackgroundResource(R.drawable.hitam)
                                binding.dua.text = "4"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "5") {
                                binding.satu.setBackgroundResource(R.drawable.merah)
                                binding.satu.text = "3"
                                binding.dua.setBackgroundResource(R.drawable.putih)
                                binding.dua.text = "5"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                        } else {
                            binding.satu.setBackgroundResource(R.drawable.merah)
                            binding.satu.text = "3"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "So Hai"
                        }
                    } else if (binding.dua.text == "4") {
                        if (binding.tiga.text != "So Ba") {
                            if (binding.tiga.text == "1") {
                                binding.satu.setBackgroundResource(R.drawable.hitam)
                                binding.satu.text = "4"
                                binding.dua.setBackgroundResource(R.drawable.kuning)
                                binding.dua.text = "1"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "3") {
                                binding.satu.setBackgroundResource(R.drawable.hitam)
                                binding.satu.text = "4"
                                binding.dua.setBackgroundResource(R.drawable.merah)
                                binding.dua.text = "3"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "5") {
                                binding.satu.setBackgroundResource(R.drawable.hitam)
                                binding.satu.text = "4"
                                binding.dua.setBackgroundResource(R.drawable.putih)
                                binding.dua.text = "5"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                        } else {
                            binding.satu.setBackgroundResource(R.drawable.hitam)
                            binding.satu.text = "4"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "So Hai"
                        }
                    } else if (binding.dua.text == "5") {
                        if (binding.tiga.text != "So Ba") {
                            if (binding.tiga.text == "1") {
                                binding.satu.setBackgroundResource(R.drawable.putih)
                                binding.satu.text = "5"
                                binding.dua.setBackgroundResource(R.drawable.kuning)
                                binding.dua.text = "1"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "3") {
                                binding.satu.setBackgroundResource(R.drawable.putih)
                                binding.satu.text = "5"
                                binding.dua.setBackgroundResource(R.drawable.merah)
                                binding.dua.text = "3"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "4") {
                                binding.satu.setBackgroundResource(R.drawable.putih)
                                binding.satu.text = "5"
                                binding.dua.setBackgroundResource(R.drawable.hitam)
                                binding.dua.text = "4"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                        } else {
                            binding.satu.setBackgroundResource(R.drawable.putih)
                            binding.satu.text = "5"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "So Hai"
                        }
                    }
                } else {
                    binding.satu.setBackgroundResource(R.drawable.buttonmixcolor)
                    binding.satu.text = "So Mot"
                }
                binding.biru.setImageResource(0)
            } else if (binding.satu.text == "3") {
                if (binding.dua.text != "So Hai") {
                    if (binding.dua.text == "1") {
                        if (binding.tiga.text != "So Ba") {
                            if (binding.tiga.text == "2") {
                                binding.satu.setBackgroundResource(R.drawable.kuning)
                                binding.satu.text = "1"
                                binding.dua.setBackgroundResource(R.drawable.biru)
                                binding.dua.text = "2"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "4") {
                                binding.satu.setBackgroundResource(R.drawable.kuning)
                                binding.satu.text = "1"
                                binding.dua.setBackgroundResource(R.drawable.hitam)
                                binding.dua.text = "4"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "5") {
                                binding.satu.setBackgroundResource(R.drawable.kuning)
                                binding.satu.text = "1"
                                binding.dua.setBackgroundResource(R.drawable.putih)
                                binding.dua.text = "5"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                        } else {
                            binding.satu.setBackgroundResource(R.drawable.kuning)
                            binding.satu.text = "1"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "So Hai"
                        }
                    } else if (binding.dua.text == "2") {
                        if (binding.tiga.text != "So Ba") {
                            if (binding.tiga.text == "1") {
                                binding.satu.setBackgroundResource(R.drawable.biru)
                                binding.satu.text = "2"
                                binding.dua.setBackgroundResource(R.drawable.kuning)
                                binding.dua.text = "1"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "4") {
                                binding.satu.setBackgroundResource(R.drawable.biru)
                                binding.satu.text = "2"
                                binding.dua.setBackgroundResource(R.drawable.hitam)
                                binding.dua.text = "4"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "5") {
                                binding.satu.setBackgroundResource(R.drawable.biru)
                                binding.satu.text = "2"
                                binding.dua.setBackgroundResource(R.drawable.putih)
                                binding.dua.text = "5"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                        } else {
                            binding.satu.setBackgroundResource(R.drawable.biru)
                            binding.satu.text = "2"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "So Hai"
                        }
                    } else if (binding.dua.text == "4") {
                        if (binding.tiga.text != "So Ba") {
                            if (binding.tiga.text == "1") {
                                binding.satu.setBackgroundResource(R.drawable.hitam)
                                binding.satu.text = "4"
                                binding.dua.setBackgroundResource(R.drawable.kuning)
                                binding.dua.text = "1"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "2") {
                                binding.satu.setBackgroundResource(R.drawable.hitam)
                                binding.satu.text = "4"
                                binding.dua.setBackgroundResource(R.drawable.biru)
                                binding.dua.text = "2"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "5") {
                                binding.satu.setBackgroundResource(R.drawable.hitam)
                                binding.satu.text = "4"
                                binding.dua.setBackgroundResource(R.drawable.putih)
                                binding.dua.text = "5"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                        } else {
                            binding.satu.setBackgroundResource(R.drawable.hitam)
                            binding.satu.text = "4"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "So Hai"
                        }
                    } else if (binding.dua.text == "5") {
                        if (binding.tiga.text != "So Ba") {
                            if (binding.tiga.text == "1") {
                                binding.satu.setBackgroundResource(R.drawable.putih)
                                binding.satu.text = "5"
                                binding.dua.setBackgroundResource(R.drawable.kuning)
                                binding.dua.text = "1"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "2") {
                                binding.satu.setBackgroundResource(R.drawable.putih)
                                binding.satu.text = "5"
                                binding.dua.setBackgroundResource(R.drawable.biru)
                                binding.dua.text = "2"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "4") {
                                binding.satu.setBackgroundResource(R.drawable.putih)
                                binding.satu.text = "5"
                                binding.dua.setBackgroundResource(R.drawable.hitam)
                                binding.dua.text = "4"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                        } else {
                            binding.satu.setBackgroundResource(R.drawable.putih)
                            binding.satu.text = "5"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "So Hai"
                        }
                    }
                } else {
                    binding.satu.setBackgroundResource(R.drawable.buttonmixcolor)
                    binding.satu.text = "So Mot"
                }
                binding.merah.setImageResource(0)
            } else if (binding.satu.text == "4") {
                if (binding.dua.text != "So Hai") {
                    if (binding.dua.text == "1") {
                        if (binding.tiga.text != "So Ba") {
                            if (binding.tiga.text == "2") {
                                binding.satu.setBackgroundResource(R.drawable.kuning)
                                binding.satu.text = "1"
                                binding.dua.setBackgroundResource(R.drawable.biru)
                                binding.dua.text = "2"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "3") {
                                binding.satu.setBackgroundResource(R.drawable.kuning)
                                binding.satu.text = "1"
                                binding.dua.setBackgroundResource(R.drawable.merah)
                                binding.dua.text = "3"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "5") {
                                binding.satu.setBackgroundResource(R.drawable.kuning)
                                binding.satu.text = "1"
                                binding.dua.setBackgroundResource(R.drawable.putih)
                                binding.dua.text = "5"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                        } else {
                            binding.satu.setBackgroundResource(R.drawable.kuning)
                            binding.satu.text = "1"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "So Hai"
                        }
                    } else if (binding.dua.text == "2") {
                        if (binding.tiga.text != "So Ba") {
                            if (binding.tiga.text == "1") {
                                binding.satu.setBackgroundResource(R.drawable.biru)
                                binding.satu.text = "2"
                                binding.dua.setBackgroundResource(R.drawable.kuning)
                                binding.dua.text = "1"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "3") {
                                binding.satu.setBackgroundResource(R.drawable.biru)
                                binding.satu.text = "2"
                                binding.dua.setBackgroundResource(R.drawable.merah)
                                binding.dua.text = "3"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "5") {
                                binding.satu.setBackgroundResource(R.drawable.biru)
                                binding.satu.text = "2"
                                binding.dua.setBackgroundResource(R.drawable.putih)
                                binding.dua.text = "5"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                        } else {
                            binding.satu.setBackgroundResource(R.drawable.biru)
                            binding.satu.text = "2"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "So Hai"
                        }
                    } else if (binding.dua.text == "3") {
                        if (binding.tiga.text != "So Ba") {
                            if (binding.tiga.text == "1") {
                                binding.satu.setBackgroundResource(R.drawable.merah)
                                binding.satu.text = "3"
                                binding.dua.setBackgroundResource(R.drawable.kuning)
                                binding.dua.text = "1"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "2") {
                                binding.satu.setBackgroundResource(R.drawable.merah)
                                binding.satu.text = "3"
                                binding.dua.setBackgroundResource(R.drawable.biru)
                                binding.dua.text = "2"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "5") {
                                binding.satu.setBackgroundResource(R.drawable.merah)
                                binding.satu.text = "3"
                                binding.dua.setBackgroundResource(R.drawable.putih)
                                binding.dua.text = "5"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                        } else {
                            binding.satu.setBackgroundResource(R.drawable.merah)
                            binding.satu.text = "3"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "So Hai"
                        }
                    } else if (binding.dua.text == "5") {
                        if (binding.tiga.text != "So Ba") {
                            if (binding.tiga.text == "1") {
                                binding.satu.setBackgroundResource(R.drawable.putih)
                                binding.satu.text = "5"
                                binding.dua.setBackgroundResource(R.drawable.kuning)
                                binding.dua.text = "1"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "2") {
                                binding.satu.setBackgroundResource(R.drawable.putih)
                                binding.satu.text = "5"
                                binding.dua.setBackgroundResource(R.drawable.biru)
                                binding.dua.text = "2"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "3") {
                                binding.satu.setBackgroundResource(R.drawable.putih)
                                binding.satu.text = "5"
                                binding.dua.setBackgroundResource(R.drawable.merah)
                                binding.dua.text = "3"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                        } else {
                            binding.satu.setBackgroundResource(R.drawable.putih)
                            binding.satu.text = "5"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "So Hai"
                        }
                    }
                } else {
                    binding.satu.setBackgroundResource(R.drawable.buttonmixcolor)
                    binding.satu.text = "So Mot"
                }
                binding.hitam.setImageResource(0)
            } else if (binding.satu.text == "5") {
                if (binding.dua.text != "So Hai") {
                    if (binding.dua.text == "1") {
                        if (binding.tiga.text != "So Ba") {
                            if (binding.tiga.text == "2") {
                                binding.satu.setBackgroundResource(R.drawable.kuning)
                                binding.satu.text = "1"
                                binding.dua.setBackgroundResource(R.drawable.biru)
                                binding.dua.text = "2"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "3") {
                                binding.satu.setBackgroundResource(R.drawable.kuning)
                                binding.satu.text = "1"
                                binding.dua.setBackgroundResource(R.drawable.merah)
                                binding.dua.text = "3"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "4") {
                                binding.satu.setBackgroundResource(R.drawable.kuning)
                                binding.satu.text = "1"
                                binding.dua.setBackgroundResource(R.drawable.hitam)
                                binding.dua.text = "4"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                        } else {
                            binding.satu.setBackgroundResource(R.drawable.kuning)
                            binding.satu.text = "1"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "So Hai"
                        }
                    } else if (binding.dua.text == "2") {
                        if (binding.tiga.text != "So Ba") {
                            if (binding.tiga.text == "1") {
                                binding.satu.setBackgroundResource(R.drawable.biru)
                                binding.satu.text = "2"
                                binding.dua.setBackgroundResource(R.drawable.kuning)
                                binding.dua.text = "1"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "3") {
                                binding.satu.setBackgroundResource(R.drawable.biru)
                                binding.satu.text = "2"
                                binding.dua.setBackgroundResource(R.drawable.merah)
                                binding.dua.text = "3"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "4") {
                                binding.satu.setBackgroundResource(R.drawable.biru)
                                binding.satu.text = "2"
                                binding.dua.setBackgroundResource(R.drawable.hitam)
                                binding.dua.text = "4"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                        } else {
                            binding.satu.setBackgroundResource(R.drawable.biru)
                            binding.satu.text = "2"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "So Hai"
                        }
                    } else if (binding.dua.text == "4") {
                        if (binding.tiga.text != "So Ba") {
                            if (binding.tiga.text == "1") {
                                binding.satu.setBackgroundResource(R.drawable.hitam)
                                binding.satu.text = "4"
                                binding.dua.setBackgroundResource(R.drawable.kuning)
                                binding.dua.text = "1"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "2") {
                                binding.satu.setBackgroundResource(R.drawable.hitam)
                                binding.satu.text = "4"
                                binding.dua.setBackgroundResource(R.drawable.biru)
                                binding.dua.text = "2"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "3") {
                                binding.satu.setBackgroundResource(R.drawable.hitam)
                                binding.satu.text = "4"
                                binding.dua.setBackgroundResource(R.drawable.merah)
                                binding.dua.text = "3"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                        } else {
                            binding.satu.setBackgroundResource(R.drawable.hitam)
                            binding.satu.text = "4"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "So Hai"
                        }
                    } else if (binding.dua.text == "3") {
                        if (binding.tiga.text != "So Ba") {
                            if (binding.tiga.text == "1") {
                                binding.satu.setBackgroundResource(R.drawable.merah)
                                binding.satu.text = "3"
                                binding.dua.setBackgroundResource(R.drawable.kuning)
                                binding.dua.text = "1"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "2") {
                                binding.satu.setBackgroundResource(R.drawable.merah)
                                binding.satu.text = "3"
                                binding.dua.setBackgroundResource(R.drawable.biru)
                                binding.dua.text = "2"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                            if (binding.tiga.text == "4") {
                                binding.satu.setBackgroundResource(R.drawable.merah)
                                binding.satu.text = "3"
                                binding.dua.setBackgroundResource(R.drawable.hitam)
                                binding.dua.text = "4"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "So Ba"
                            }
                        } else {
                            binding.satu.setBackgroundResource(R.drawable.merah)
                            binding.satu.text = "3"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "So Hai"
                        }
                    }
                } else {
                    binding.satu.setBackgroundResource(R.drawable.buttonmixcolor)
                    binding.satu.text = "So Mot"
                }
                binding.putih.setImageResource(0)
            }
        }

        binding.dua.setOnClickListener {
            if (binding.dua.text == "1") {
                if (binding.tiga.text != "So Ba") {
                    if (binding.tiga.text == "2") {
                        binding.dua.setBackgroundResource(R.drawable.biru)
                        binding.dua.text = "2"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "So Ba"
                    }
                    if (binding.tiga.text == "3") {
                        binding.dua.setBackgroundResource(R.drawable.merah)
                        binding.dua.text = "3"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "So Ba"
                    }
                    if (binding.tiga.text == "4") {
                        binding.dua.setBackgroundResource(R.drawable.hitam)
                        binding.dua.text = "4"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "So Ba"
                    }
                    if (binding.tiga.text == "5") {
                        binding.dua.setBackgroundResource(R.drawable.putih)
                        binding.dua.text = "5"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "So Ba"
                    }
                } else {
                    binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                    binding.dua.text = "So Hai"
                }
                binding.kuning.setImageResource(0)
            } else if (binding.dua.text == "2") {
                if (binding.tiga.text != "So Ba") {
                    if (binding.tiga.text == "1") {
                        binding.dua.setBackgroundResource(R.drawable.kuning)
                        binding.dua.text = "1"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "So Ba"
                    }
                    if (binding.tiga.text == "3") {
                        binding.dua.setBackgroundResource(R.drawable.merah)
                        binding.dua.text = "3"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "So Ba"
                    }
                    if (binding.tiga.text == "4") {
                        binding.dua.setBackgroundResource(R.drawable.hitam)
                        binding.dua.text = "4"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "So Ba"
                    }
                    if (binding.tiga.text == "5") {
                        binding.dua.setBackgroundResource(R.drawable.putih)
                        binding.dua.text = "5"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "So Ba"
                    }
                } else {
                    binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                    binding.dua.text = "So Hai"
                }
                binding.biru.setImageResource(0)
            } else if (binding.dua.text == "3") {
                if (binding.tiga.text != "So Ba") {
                    if (binding.tiga.text == "1") {
                        binding.dua.setBackgroundResource(R.drawable.kuning)
                        binding.dua.text = "1"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "So Ba"
                    }
                    if (binding.tiga.text == "2") {
                        binding.dua.setBackgroundResource(R.drawable.biru)
                        binding.dua.text = "2"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "So Ba"
                    }
                    if (binding.tiga.text == "4") {
                        binding.dua.setBackgroundResource(R.drawable.hitam)
                        binding.dua.text = "4"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "So Ba"
                    }
                    if (binding.tiga.text == "5") {
                        binding.dua.setBackgroundResource(R.drawable.putih)
                        binding.dua.text = "5"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "So Ba"
                    }
                } else {
                    binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                    binding.dua.text = "So Hai"
                }
                binding.merah.setImageResource(0)
            } else if (binding.dua.text == "4") {
                if (binding.tiga.text != "So Ba") {
                    if (binding.tiga.text == "2") {
                        binding.dua.setBackgroundResource(R.drawable.biru)
                        binding.dua.text = "2"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "So Ba"
                    }
                    if (binding.tiga.text == "3") {
                        binding.dua.setBackgroundResource(R.drawable.merah)
                        binding.dua.text = "3"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "So Ba"
                    }
                    if (binding.tiga.text == "1") {
                        binding.dua.setBackgroundResource(R.drawable.kuning)
                        binding.dua.text = "1"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "So Ba"
                    }
                    if (binding.tiga.text == "5") {
                        binding.dua.setBackgroundResource(R.drawable.putih)
                        binding.dua.text = "5"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "So Ba"
                    }
                } else {
                    binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                    binding.dua.text = "So Hai"
                }
                binding.hitam.setImageResource(0)
            } else if (binding.dua.text == "5") {
                if (binding.tiga.text != "So Ba") {
                    if (binding.tiga.text == "2") {
                        binding.dua.setBackgroundResource(R.drawable.biru)
                        binding.dua.text = "2"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "So Ba"
                    }
                    if (binding.tiga.text == "3") {
                        binding.dua.setBackgroundResource(R.drawable.merah)
                        binding.dua.text = "3"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "So Ba"
                    }
                    if (binding.tiga.text == "1") {
                        binding.dua.setBackgroundResource(R.drawable.kuning)
                        binding.dua.text = "1"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "So Ba"
                    }
                    if (binding.tiga.text == "4") {
                        binding.dua.setBackgroundResource(R.drawable.hitam)
                        binding.dua.text = "4"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "So Ba"
                    }
                } else {
                    binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                    binding.dua.text = "So Hai"
                }
                binding.putih.setImageResource(0)
            }

        }

        binding.tiga.setOnClickListener {
            if (binding.tiga.text == "1") {
                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                binding.kuning.setImageResource(0)
            }
            if (binding.tiga.text == "2") {
                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                binding.biru.setImageResource(0)
            }
            if (binding.tiga.text == "3") {
                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                binding.merah.setImageResource(0)
            }
            if (binding.tiga.text == "4") {
                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                binding.hitam.setImageResource(0)
            }
            if (binding.tiga.text == "5") {
                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                binding.putih.setImageResource(0)
            }
            binding.tiga.text = "So Ba"
        }

        binding.mix.setOnClickListener {
            if (binding.satu.text == "1") {
                if (binding.dua.text == "2") {
                    if (binding.tiga.text == "3") {
                        hitam()
                    } else if (binding.tiga.text == "4") {
                        hijautua()
                    } else if (binding.tiga.text == "5") {
                        hijaumuda()
                    } else {
                        hijau()
                    }
                } else if (binding.dua.text == "3") {
                    if (binding.tiga.text == "2") {
                        hitam()
                    } else if (binding.tiga.text == "4") {
                        orangetua()
                    } else if (binding.tiga.text == "5") {
                        orangemuda()
                    } else {
                        orange()
                    }
                } else if (binding.dua.text == "4") {
                    if (binding.tiga.text == "2") {
                        hijautua()
                    } else if (binding.tiga.text == "3") {
                        orangetua()
                    } else if (binding.tiga.text == "5") {
                        kuning()
                    } else {
                        kuningtua()
                    }
                } else if (binding.dua.text == "5") {
                    if (binding.tiga.text == "2") {
                        hijaumuda()
                    } else if (binding.tiga.text == "3") {
                        orangemuda()
                    } else if (binding.tiga.text == "4") {
                        kuning()
                    } else {
                        kuningmuda()
                    }
                } else {
                    kuning()
                }
            } else if (binding.satu.text == "2") {

                if (binding.dua.text == "1") {
                    if (binding.tiga.text == "3") {
                        hitam()
                    } else if (binding.tiga.text == "4") {
                        hijautua()
                    } else if (binding.tiga.text == "5") {
                        hijaumuda()
                    } else {
                        hijau()
                    }
                } else if (binding.dua.text == "3") {
                    if (binding.tiga.text == "1") {
                        hitam()
                    } else if (binding.tiga.text == "4") {
                        ungutua()
                    } else if (binding.tiga.text == "5") {
                        ungumuda()
                    } else {
                        ungu()
                    }
                } else if (binding.dua.text == "4") {
                    if (binding.tiga.text == "1") {
                        hijautua()
                    } else if (binding.tiga.text == "3") {
                        ungutua()
                    } else if (binding.tiga.text == "5") {
                        biru()
                    } else {
                        birutua()
                    }
                } else if (binding.dua.text == "5") {
                    if (binding.tiga.text == "1") {
                        hijaumuda()
                    } else if (binding.tiga.text == "3") {
                        ungumuda()
                    } else if (binding.tiga.text == "4") {
                        biru()
                    } else {
                        birumuda()
                    }
                } else {
                    biru()
                }
            } else if (binding.satu.text == "3") {
                if (binding.dua.text == "1") {
                    if (binding.tiga.text == "2") {
                        hitam()
                    } else if (binding.tiga.text == "4") {
                        orangetua()
                    } else if (binding.tiga.text == "5") {
                        orangemuda()
                    } else {
                        orange()
                    }
                } else if (binding.dua.text == "2") {
                    if (binding.tiga.text == "1") {
                        hitam()
                    } else if (binding.tiga.text == "4") {
                        ungutua()
                    } else if (binding.tiga.text == "5") {
                        ungumuda()
                    } else {
                        ungu()
                    }
                } else if (binding.dua.text == "4") {
                    if (binding.tiga.text == "1") {
                        orangetua()
                    } else if (binding.tiga.text == "2") {
                        ungutua()
                    } else if (binding.tiga.text == "5") {
                        merah()
                    } else {
                        merahtua()
                    }
                } else if (binding.dua.text == "5") {
                    if (binding.tiga.text == "2") {
                        ungumuda()
                    } else if (binding.tiga.text == "4") {
                        merah()
                    } else if (binding.tiga.text == "1") {
                        orangemuda()
                    } else {
                        merahmuda()
                    }
                } else {
                    merah()
                }
            } else if (binding.satu.text == "4") {
                if (binding.dua.text == "1") {
                    if (binding.tiga.text == "2") {
                        hijautua()
                    } else if (binding.tiga.text == "3") {
                        orangetua()
                    } else if (binding.tiga.text == "5") {
                        kuning()
                    } else {
                        kuningtua()
                    }
                } else if (binding.dua.text == "2") {
                    if (binding.tiga.text == "1") {
                        hijautua()
                    } else if (binding.tiga.text == "3") {
                        ungutua()
                    } else if (binding.tiga.text == "5") {
                        biru()
                    } else {
                        birutua()
                    }
                } else if (binding.dua.text == "3") {
                    if (binding.tiga.text == "2") {
                        ungutua()
                    } else if (binding.tiga.text == "1") {
                        orangetua()
                    } else if (binding.tiga.text == "5") {
                        merah()
                    } else {
                        merahtua()
                    }
                } else if (binding.dua.text == "5") {
                    if (binding.tiga.text == "2") {
                        biru()
                    } else if (binding.tiga.text == "3") {
                        merah()
                    } else if (binding.tiga.text == "1") {
                        kuning()
                    } else {
                        abu()
                    }
                } else {
                    hitam()
                }
            } else if (binding.satu.text == "5") {
                if (binding.dua.text == "1") {
                    if (binding.tiga.text == "2") {
                        hijaumuda()
                    } else if (binding.tiga.text == "3") {
                        orangemuda()
                    } else if (binding.tiga.text == "4") {
                        kuning()
                    } else {
                        kuningmuda()
                    }
                } else if (binding.dua.text == "2") {
                    if (binding.tiga.text == "1") {
                        hijaumuda()
                    } else if (binding.tiga.text == "3") {
                        ungumuda()
                    } else if (binding.tiga.text == "4") {
                        biru()
                    } else {
                        birumuda()
                    }
                } else if (binding.dua.text == "3") {
                    if (binding.tiga.text == "2") {
                        ungumuda()
                    } else if (binding.tiga.text == "1") {
                        orangemuda()
                    } else if (binding.tiga.text == "4") {
                        merah()
                    } else {
                        merahmuda()
                    }
                } else if (binding.dua.text == "4") {
                    if (binding.tiga.text == "2") {
                        biru()
                    } else if (binding.tiga.text == "3") {
                        merah()
                    } else if (binding.tiga.text == "1") {
                        kuning()
                    } else {
                        abu()
                    }
                } else {
                    putih()
                }
            } else {
                Toast.makeText(this, "Hãy chơi với màu sắc", Toast.LENGTH_SHORT).show()
                binding.bigColor.setImageResource(R.color.putihkotor)
                binding.namawarnaindo.text = ""
                binding.namawarnaing.text = ""
            }
        }

        binding.soundon.setOnClickListener {
            soundOn()
        }
    }

    fun soundOn() {
        if (binding.namawarnaing.text == "Black") {
            player = MediaPlayer.create(this, R.raw.black)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        } else if (binding.namawarnaing.text == "Grey") {
            player = MediaPlayer.create(this, R.raw.grey)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        } else if (binding.namawarnaing.text == "White") {
            player = MediaPlayer.create(this, R.raw.white)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        } else if (binding.namawarnaing.text == "Yellow") {
            player = MediaPlayer.create(this, R.raw.yellow)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        } else if (binding.namawarnaing.text == "Dark Yellow") {
            player = MediaPlayer.create(this, R.raw.kuningtua)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        } else if (binding.namawarnaing.text == "Light Yellow") {
            player = MediaPlayer.create(this, R.raw.kuningmuda)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        } else if (binding.namawarnaing.text == "Red") {
            player = MediaPlayer.create(this, R.raw.red)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        } else if (binding.namawarnaing.text == "Dark Red") {
            player = MediaPlayer.create(this, R.raw.merahtua)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        } else if (binding.namawarnaing.text == "Pink") {
            player = MediaPlayer.create(this, R.raw.pink)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        } else if (binding.namawarnaing.text == "Blue") {
            player = MediaPlayer.create(this, R.raw.blue)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        } else if (binding.namawarnaing.text == "Dark Blue") {
            player = MediaPlayer.create(this, R.raw.darkblue)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        } else if (binding.namawarnaing.text == "Light Blue") {
            player = MediaPlayer.create(this, R.raw.birumuda)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        } else if (binding.namawarnaing.text == "Orange") {
            player = MediaPlayer.create(this, R.raw.orange)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        } else if (binding.namawarnaing.text == "Dark Orange") {
            player = MediaPlayer.create(this, R.raw.oranyetua)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        } else if (binding.namawarnaing.text == "Light Orange") {
            player = MediaPlayer.create(this, R.raw.oranyemuda)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        } else if (binding.namawarnaing.text == "Green") {
            player = MediaPlayer.create(this, R.raw.green)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        } else if (binding.namawarnaing.text == "Dark Green") {
            player = MediaPlayer.create(this, R.raw.hijautua)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        } else if (binding.namawarnaing.text == "Light Green") {
            player = MediaPlayer.create(this, R.raw.hijaumuda)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        } else if (binding.namawarnaing.text == "Purple") {
            player = MediaPlayer.create(this, R.raw.purple)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        } else if (binding.namawarnaing.text == "Dark Purple") {
            player = MediaPlayer.create(this, R.raw.ungutua)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        } else if (binding.namawarnaing.text == "Light Purple") {
            player = MediaPlayer.create(this, R.raw.ungumuda)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        }
    }

    fun hitam() {
        binding.namawarnaindo.text = "Đen"
        binding.namawarnaing.text = "Black"
        binding.bigColor.setImageResource(R.color.hitam)
    }

    fun merah() {
        binding.namawarnaindo.text = "đỏ"
        binding.namawarnaing.text = "Red"
        binding.bigColor.setImageResource(R.color.merah)
    }

    fun merahtua() {
        binding.namawarnaindo.text = "Đỏ đậm"
        binding.namawarnaing.text = "Dark Red"
        binding.bigColor.setImageResource(R.color.merahtua)
    }

    fun merahmuda() {
        binding.namawarnaindo.text = "Hồng"
        binding.namawarnaing.text = "Pink"
        binding.bigColor.setImageResource(R.color.merahmuda)
    }

    fun kuning() {
        binding.namawarnaindo.text = "Vàng"
        binding.namawarnaing.text = "Yellow"
        binding.bigColor.setImageResource(R.color.kuning)
    }

    fun kuningtua() {
        binding.namawarnaindo.text = "Vàng đậm"
        binding.namawarnaing.text = "Dark Yellow"
        binding.bigColor.setImageResource(R.color.kuningtua)
    }

    fun kuningmuda() {
        binding.namawarnaindo.text = "Vàng nhạt"
        binding.namawarnaing.text = "Light Yellow"
        binding.bigColor.setImageResource(R.color.kuningmuda)
    }

    fun hijau() {
        binding.namawarnaindo.text = "Xanh"
        binding.namawarnaing.text = "Green"
        binding.bigColor.setImageResource(R.color.hijau)
    }

    fun hijautua() {
        binding.namawarnaindo.text = "Xanh đậm"
        binding.namawarnaing.text = "Dark Green"
        binding.bigColor.setImageResource(R.color.hijautua)
    }

    fun hijaumuda() {
        binding.namawarnaindo.text = "Xanh nhạt"
        binding.namawarnaing.text = "Light Green"
        binding.bigColor.setImageResource(R.color.hijaumuda)
    }

    fun orange() {
        binding.namawarnaindo.text = "Cam"
        binding.namawarnaing.text = "Orange"
        binding.bigColor.setImageResource(R.color.orange)
    }

    fun orangetua() {
        binding.namawarnaindo.text = "Cam đậm"
        binding.namawarnaing.text = "Dark Orange"
        binding.bigColor.setImageResource(R.color.orangetua)
    }

    fun orangemuda() {
        binding.namawarnaindo.text = "Cam nhạt"
        binding.namawarnaing.text = "Light Orange"
        binding.bigColor.setImageResource(R.color.orangemuda)
    }

    fun ungu() {
        binding.namawarnaindo.text = "Tím"
        binding.namawarnaing.text = "Purple"
        binding.bigColor.setImageResource(R.color.ungu)
    }

    fun ungumuda() {
        binding.namawarnaindo.text = "Tím nhạt"
        binding.namawarnaing.text = "Light Purple"
        binding.bigColor.setImageResource(R.color.ungumuda)
    }

    fun ungutua() {
        binding.namawarnaindo.text = "Tím đậm"
        binding.namawarnaing.text = "Dark Purple"
        binding.bigColor.setImageResource(R.color.ungutua)
    }

    fun biru() {
        binding.namawarnaindo.text = "Xanh da trời"
        binding.namawarnaing.text = "Blue"
        binding.bigColor.setImageResource(R.color.biru)
    }

    fun birumuda() {
        binding.namawarnaindo.text = "Xanh lợt"
        binding.namawarnaing.text = "Light Blue"
        binding.bigColor.setImageResource(R.color.birumuda)
    }

    fun birutua() {
        binding.namawarnaindo.text = "Xanh Đậm"
        binding.namawarnaing.text = "Dark Blue"
        binding.bigColor.setImageResource(R.color.birutua)
    }

    fun abu() {
        binding.namawarnaindo.text = "Xám"
        binding.namawarnaing.text = "Grey"
        binding.bigColor.setImageResource(R.color.abuabu)
    }

    fun putih() {
        binding.namawarnaindo.text = "Trắng"
        binding.namawarnaing.text = "White"
        binding.bigColor.setImageResource(R.color.putih)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
    }
}