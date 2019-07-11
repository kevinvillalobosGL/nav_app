package com.gl.navapp.first


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.gl.navapp.R
import kotlinx.android.synthetic.main.fragment_next.*

class NextFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_next, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Setup Click Listener
        button_next.setOnClickListener {
            // Get number from Edit Text
            val number: Int = try {
                et_number.text.toString().toInt()
            } catch (e: Exception) {
                0
            }

            // Handle Navigation using Action from Safe Args
            val action = NextFragmentDirections.actionNext(number)
            findNavController().navigate(action)
        }
    }


}
