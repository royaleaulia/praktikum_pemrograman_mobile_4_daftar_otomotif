package com.example.automotivelist.ui.oli

import android.os.Bundle
import android.view.*
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.automotivelist.adapter.OliAdapter
import com.example.automotivelist.databinding.FragmentOliBinding


class OliFragment : Fragment() {

    private var _binding: FragmentOliBinding? = null
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView
    private var isLinearLayoutManager = true

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentOliBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.oliRecyclerView
        recyclerView.adapter = OliAdapter(requireContext(), OliViewModel().LoadData())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}