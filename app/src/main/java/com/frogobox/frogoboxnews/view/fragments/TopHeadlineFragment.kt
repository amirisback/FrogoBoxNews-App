package com.frogobox.frogoboxnews.view.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.frogobox.frogoboxnews.R
import com.frogobox.frogoboxnews.view.adapters.viewpager.FragmentViewPagerAdapter
import kotlinx.android.synthetic.main.fragment_top_headline.view.*


class TopHeadlineFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_top_headline, container, false)

        val pagerAdapter = FragmentViewPagerAdapter(childFragmentManager)
        pagerAdapter.addFragment(TopHeadlineGeneralFragment(), resources.getString(R.string.tab_general))
        pagerAdapter.addFragment(TopHeadlineTechnologyFragment(), resources.getString(R.string.tab_technology))
        rootView.frg_top_viewpager.adapter = pagerAdapter
        rootView.frg_top_tablyout.setupWithViewPager(rootView.frg_top_viewpager)

        return rootView
    }


}
