package com.garda.smartglovesapp1.home

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.garda.smartglovesapp1.R
import com.garda.smartglovesapp1.bluetooth.BluetoothActivity
import org.w3c.dom.Text
import java.util.*
import kotlin.concurrent.timer

class HomeFragment : Fragment() {
//    private var bpm: TextView
//    private var Input:String = ""
//    private var timer:Timer? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val img_btn:ImageButton = view.findViewById(R.id.butut_btn)
        val refresh:TextView = view.findViewById(R.id.refreshSensor)
        val bpm:TextView = view.findViewById(R.id.txt_bpm)
        val spo2:TextView = view.findViewById(R.id.txt_spo2)
        val suhu:TextView = view.findViewById(R.id.txt_suhu)
//        img_btn.setOnClickListener {
//            requireActivity().run{
//                startActivity(Intent(this, BluetoothActivity::class.java))
//                finish()
//            }
//        }

        refresh.setOnClickListener {
            val randomBpm = (60..70).random()
            bpm.setText(randomBpm.toString() + " bpm")

            val randomSpo2 = (94..96).random()
            spo2.setText(randomSpo2.toString() + "%")

            var randomSuhu = (35..36).random()
            val randomSuhuDec = (10..99).random()
            val randomSuhuF:Float = randomSuhu.toFloat() + randomSuhuDec.toFloat()/100

            suhu.setText(randomSuhuF.toString())

        }






    }


    companion object {
        fun newInstance(): HomeFragment{
            val fragment = HomeFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}