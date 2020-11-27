package com.anto.praktikummobile8

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagerAdapter(private val mContext: Context, fm:
FragmentManager) :
    FragmentPagerAdapter(fm) {

    //Memanggil getItem untuk membuat instance fragment
    override fun getItem(position: Int): Fragment {
        return if (position == 0) {
            FirstFragment.newInstance()
        }
        else if(position == 1) {
            SecondFragment.newInstance()
        }
        else {
            ThirdFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mContext.resources.getString(TAB_TITLES[position])
    }

    //Tampilkan 3 halaman
    override fun getCount(): Int {
        return 3
    }

    //Mengakses Member Dari Class Tanpa Objek
    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(R.string.tab_text_1,
            R.string.tab_text_2, R.string.tab_text_3)
    }

}