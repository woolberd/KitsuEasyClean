package com.example.kitsueasyclean.presentation.ui.fragments.manga.detail

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import com.example.kitsueasyclean.R
import com.example.kitsueasyclean.databinding.FragmentMangaDetailBinding
import com.example.kitsueasyclean.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MangaDetailFragment :
    BaseFragment<FragmentMangaDetailBinding, MangaDetailViewModel>(R.layout.fragment_manga_detail) {

    override val binding by viewBinding(FragmentMangaDetailBinding::bind)
    override val viewModel: MangaDetailViewModel by viewModels()
    private val args: MangaDetailFragmentArgs by navArgs()

    override fun setupSubscribes() {
        binding.tvMangaDetail.text = args.model.attributes.titles.enJp
        Glide.with(binding.imgMangaDetail).load(args.model.attributes.posterImage.large)
            .into(binding.imgMangaDetail)
    }
}