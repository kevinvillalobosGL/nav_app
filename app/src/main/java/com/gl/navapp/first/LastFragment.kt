package com.gl.navapp.first


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.gl.navapp.R
import kotlinx.android.synthetic.main.fragment_last.*

class LastFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_last, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Get the Number from Safe Args
        val safeArgs: LastFragmentArgs by navArgs()
        txv_number.text = safeArgs.num.toString()

        // Setup Click Listener
        button_last.setOnClickListener {
            // Handle Navigation using Destination
            findNavController().navigate(R.id.main_activity)

            // Finish the Parent Activity, we don't want to get back here!
            if (activity != null) activity!!.finish()
        }
    }

}
