package com.kaspersky.kaspressample

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.util.concurrent.Executors
import kotlinx.android.synthetic.main.fragment_simple.*

class SimpleFragment : Fragment() {

    companion object {
        fun newInstance() = SimpleFragment()

        const val TAG = "SimpleFragment"
        private const val TIMEOUT: Long = 2000
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_simple, container, false)
    }

    override fun onResume() {
        super.onResume()
        button_1.setOnClickListener {
            button_2.visibility = View.VISIBLE
        }
        button_2.setOnClickListener {
            // special sleep to emulate ui block operation to check attempt method correctness
            Executors.newSingleThreadExecutor().submit {
                Thread.sleep(TIMEOUT)
                activity?.runOnUiThread { edit.visibility = View.VISIBLE }
            }
        }
    }
}