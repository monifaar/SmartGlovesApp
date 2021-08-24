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

    private var mStatusBlueTv: TextView? = null
    private var mPairedTv: TextView? = null
    private var mOnBtn: Button? = null
    private var mOffBtn: Button? = null
    private var mDiscoverBtn: Button? = null
    private var mPairedBtn: Button? = null
    private var mBlueAdapter: BluetoothAdapter? = null

    companion object {
        private const val REQUEST_ENABLE_BT = 0
        private const val REQUEST_DISCOVER_BT = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bluetooth)

        mStatusBlueTv = findViewById(R.id.statusBluetoothTy)
        mPairedTv = findViewById(R.id.pairedTy)
        mOnBtn = findViewById(R.id.onBtn)
        mOffBtn = findViewById(R.id.offBtn)
        mDiscoverBtn = findViewById(R.id.discoverableBtn)
        mPairedBtn = findViewById(R.id.pairedBtn)

        mBlueAdapter = BluetoothAdapter.getDefaultAdapter()

        if (mBlueAdapter == null) {
            with(mStatusBlueTv) { this?.setText("Bluetooth is not available") }
        }
        else{
            with(mStatusBlueTv) { this?.setText("Bluetooth is available") }
        }

        val mOnBtn2:Button = findViewById(R.id.onBtn)
        mOnBtn2.setOnClickListener {

        }

//        mOnBtn.setOnClickListener(object : OnClickListener() {
//            fun onClick(v: View?) {
//                if (!mBlueAdapter.isEnabled()) {
//                    showToast("Turning On Bluetooth...")
//                    //intent to on bluetooth
//                    val intent = Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)
//                    startActivityForResult(intent, REQUEST_ENABLE_BT)
//                } else {
//                    showToast("Bluetooth is already on")
//                }
//            }
//        })
//        //discover bluetooth btn click
//        mDiscoverBtn.setOnClickListener(object : OnClickListener() {
//            fun onClick(v: View?) {
//                if (!mBlueAdapter.isDiscovering()) {
//                    showToast("Making Your Device Discoverable")
//                    val intent = Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE)
//                    startActivityForResult(intent, REQUEST_DISCOVER_BT)
//                }
//            }
//        })
//        //off btn click
//        mOffBtn.setOnClickListener(object : OnClickListener() {
//            fun onClick(v: View?) {
//                if (mBlueAdapter.isEnabled()) {
//                    mBlueAdapter.disable()
//                    showToast("Turning Bluetooth Off")
//                    mBlueIv.setImageResource(R.drawable.ic_action_off)
//                } else {
//                    showToast("Bluetooth is already off")
//                }
//            }
//        })
//        //get paired devices btn click
//        mPairedBtn.setOnClickListener(object : OnClickListener() {
//            fun onClick(v: View?) {
//                if (mBlueAdapter.isEnabled()) {
//                    mPairedTv.setText("Paired Devices")
//                    val devices = mBlueAdapter.getBondedDevices()
//                    for (device in devices) {
//                        mPairedTv.append(
//                                """
//
//                                Device: ${device.name}, $device
//                                """.trimIndent()
//                        )
//                    }
//                } else {
//                    //bluetooth is off so can't get paired devices
//                    showToast("Turn on bluetooth to get paired devices")
//                }
//            }
//        })
        }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        when (requestCode) {
//            REQUEST_ENABLE_BT -> if (resultCode == RESULT_OK) {
//                //bluetooth is on
//                mBlueIv.setImageResource(R.drawable.ic_action_on)
//                showToast("Bluetooth is on")
//            } else {
//                //user denied to turn bluetooth on
//                showToast("could't on bluetooth")
//            }
//        }
//        super.onActivityResult(requestCode, resultCode, data)
//    }

    //toast message function
//    private fun showToast(msg: String) {
//        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
//    }

}