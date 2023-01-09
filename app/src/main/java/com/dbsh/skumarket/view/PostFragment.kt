package com.dbsh.skumarket.view

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.dbsh.skumarket.R
import com.dbsh.skumarket.databinding.FragmentChatBinding
import com.dbsh.skumarket.databinding.FragmentPostBinding
import com.dbsh.skumarket.viewmodels.ChatViewModel
import com.dbsh.skumarket.viewmodels.PostViewModel

class PostFragment : Fragment() {
    private lateinit var binding : FragmentPostBinding
    private lateinit var viewModel: PostViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_post, container, false)
        viewModel = PostViewModel()
        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = viewModel

        }
        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }
}