package com.garda.smartglovesapp1.bluetooth

import android.bluetooth.BluetoothAdapter
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.garda.smartglovesapp1.R


class BluetoothActivity : AppCompatActivity(){

//    private var mStatusBlueTv: TextView? = null
//    private var mPairedTv: TextView? = null
//    private var mOnBtn: Button? = null
//    private var mOffBtn: Button? = null
//    private var mDiscoverBtn: Button? = null
//    private var mPairedBtn: Button? = null
//    private var mBlueAdapter: BluetoothAdapter? = null

    companion object {
        private const val REQUEST_ENABLE_BT = 0
        private const val REQUEST_DISCOVER_BT = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bluetooth)

//        mStatusBlueTv = findViewById(R.id.statusBluetoothTy)
//        mPairedTv = findViewById(R.id.pairedTy)
//        mOnBtn = findViewById(R.id.onBtn)
//        mOffBtn = findViewById(R.id.offBtn)
//        mDiscoverBtn = findViewById(R.id.discoverableBtn)
//        mPairedBtn = findViewById(R.id.pairedBtn)
//
//        mBlueAdapter = BluetoothAdapter.getDefaultAdapter()
//
//        if (mBlueAdapter == null) {
//            with(mStatusBlueTv) { this?.setText("Bluetooth is not available") }
//        }
//        else{
//            with(mStatusBlueTv) { this?.setText("Bluetooth is available") }
//        }
//
//        val mOnBtn2:Button = findViewById(R.id.onBtn)
//        mOnBtn2.setOnClickListener {
//
//        }


        }



}