/*
 * Copyright (C) 2019 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * ViewModel containing all the logic needed to run the game
 */
class GameViewModel : ViewModel() {


    // TODO :: Ubah score dan word untuk menggunakan LiveData

    // TODO :: Mengemas LiveData

    // The current word
    private val _word = MutableLiveData<String>()
    val word:LiveData<String>
        get() = _word

    // The current score
    private val _score = MutableLiveData<Int>()
    val score:LiveData<Int>
        get() = _score

    // The list of words - the front of the list is the next word to guess
    private lateinit var wordList: MutableList<String>

    // TODO :: Menambahkan acara yang sudah selesai game
    private val _eventGameFinish = MutableLiveData<Boolean>()
    val eventGameFinish:LiveData<Boolean>
        get() = _eventGameFinish


    /**
     * Resets the list of words and randomizes the order
     */
    private fun resetList() {
        wordList = mutableListOf(
                "queen",
                "hospital",
                "basketball",
                "cat",
                "change",
                "snail",
                "soup",
                "calendar",
                "sad",
                "desk",
                "guitar",
                "home",
                "railway",
                "zebra",
                "jelly",
                "car",
                "crow",
                "trade",
                "bag",
                "roll",
                "bubble"
        )
        wordList.shuffle()
    }

    init {
        // inisialisasi score dan word
        _word.value = ""
        _score.value = 0

        Log.i("GameViewModel", "GameViewModel created!")
        resetList()
        nextWord()
    }

    /**
     * Callback called when the ViewModel is destroyed
     */
    override fun onCleared() {
        super.onCleared()
        Log.i("GameViewModel", "GameViewModel destroyed!")
    }

    // TODO :: Perbarui referensi objek LiveData

    /** Methods for updating the UI **/
    fun onSkip() {
        _score.value = (score.value)?.minus(1)
        nextWord()
    }
    fun onCorrect() {
        _score.value = (score.value)?.plus(1)
        nextWord()
    }

    /**
     * Moves to the next word in the list.
     */
    private fun nextWord() {
        //Select and remove a word from the list
        if (wordList.isEmpty()) {
            onGameFinish()
        }else{
            // referensi word menjadi word.value
            _word.value = wordList.removeAt(0)
        }
    }

    fun onGameFinish(){
        _eventGameFinish.value = true
    }

    // TODO :: Mereset event game-finished
    fun onGameFinishComplete(){
        _eventGameFinish.value = false
    }
}
