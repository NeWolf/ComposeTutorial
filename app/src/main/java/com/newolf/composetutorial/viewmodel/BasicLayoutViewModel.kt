package com.newolf.composetutorial.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.newolf.composetutorial.R
import com.newolf.composetutorial.data.AlignYouBody

/**
 * ======================================================================
 *
 *
 * @author : NeWolf
 * @version : 1.0
 * @since :  2024-02-21
 *
 * =======================================================================
 */
class BasicLayoutViewModel : ViewModel() {


    val alignYouBodyList = MutableLiveData<List<AlignYouBody>>()

    val favoriteCardList = MutableLiveData<List<AlignYouBody>>()


    fun mockData() {
        val bodies = ArrayList<AlignYouBody>()
        bodies.add(AlignYouBody(R.drawable.ab1_inversions,R.string.ab1_inversions))
        bodies.add(AlignYouBody(R.drawable.ab2_quick_yoga,R.string.ab2_quick_yoga))
        bodies.add(AlignYouBody(R.drawable.ab3_stretching,R.string.ab3_stretching))
        bodies.add(AlignYouBody(R.drawable.ab4_tabata,R.string.ab4_tabata))
        bodies.add(AlignYouBody(R.drawable.ab5_hiit,R.string.ab5_hiit))
        bodies.add(AlignYouBody(R.drawable.ab6_pre_natal_yoga,R.string.ab6_pre_natal_yoga))

        alignYouBodyList.value = bodies


        val favorites = ArrayList<AlignYouBody>()

        favorites.add(AlignYouBody(R.drawable.fc1_short_mantras,R.string.fc1_short_mantras))
        favorites.add(AlignYouBody(R.drawable.fc2_nature_meditations,R.string.fc2_nature_meditations))
        favorites.add(AlignYouBody(R.drawable.fc3_stress_and_anxiety,R.string.fc3_stress_and_anxiety))
        favorites.add(AlignYouBody(R.drawable.fc4_self_massage,R.string.fc4_self_massage))
        favorites.add(AlignYouBody(R.drawable.fc5_overwhelmed,R.string.fc5_overwhelmed))
        favorites.add(AlignYouBody(R.drawable.fc6_nightly_wind_down,R.string.fc6_nightly_wind_down))
        favoriteCardList.value = favorites

    }
}