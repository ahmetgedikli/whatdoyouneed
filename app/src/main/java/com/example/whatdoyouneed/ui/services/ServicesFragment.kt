package com.example.whatdoyouneed.ui.services

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.whatdoyouneed.MainActivity
import com.example.whatdoyouneed.R
import com.example.whatdoyouneed.databinding.FragmentServicesBinding
import kotlinx.android.synthetic.*


class ServicesFragment : Fragment() {

    private lateinit var servicesViewModel: ServicesViewModel
    private var _binding: FragmentServicesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

    }



    lateinit var rv: RecyclerView



    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {




        var view=inflater.inflate(R.layout.fragment_services, container,false)
        rv = view.findViewById(R.id.rec_view)
        rv.layoutManager = LinearLayoutManager(activity)
        val service: ArrayList<Service> = ArrayList<Service>()
        service.add(Service(R.drawable.ic_baseline_child_friendly_24,"BEST BABY SITTER RATED 5 STAR","ANNA SOKKA"))
        service.add(Service(R.drawable.ic_baseline_child_friendly_24,"BEST BABY SITTER RATED 5 STAR","ANNA SOKKA"))
        service.add(Service(R.drawable.ic_baseline_child_friendly_24,"BEST BABY SITTER RATED 5 STAR","ANNA SOKKA"))
        rv.adapter=ServicesAdapter(service)



        servicesViewModel =
                ViewModelProvider(this).get(ServicesViewModel::class.java)

        _binding = FragmentServicesBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return view
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}