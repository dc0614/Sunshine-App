/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Diana Copeland Sunshine program 1.2
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //COMPLETED TODO (1) Create a field to store the weather display TextView
    private TextView weatherDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        //COMPLETED TODO (2) Use findViewById to get a reference to the weather display TextView
        weatherDisplay  = (TextView) findViewById(R.id.tv_weather_data);

        //COMPLETED TODO (3) Create an array of Strings that contain fake weather data
        String [] fakeWeather = {
                "Today,     Jan 11th,    Clear with a chance of rain.",
                "Tomorrow,  Jan 13th,    Sunshine but cold.",
                "Sunday,    Jan 14th,    Sunshine and the temps will rise to 45.",
                "Monday,    Jan 15th,    Sunny in the upper 60s.",
                "Tuesday,   Jan 16th,    Cloudy with a chance of rain.",
                "Wednesday, Jan 17th,    Clear in the upper 50s."
        };

        //COMPLETED TODO (4) Append each String from the fake weather data array to the TextView
        for(String fakeWeatherNow: fakeWeather){
            weatherDisplay.append(fakeWeatherNow + "\n\n\n");
        }
    }
}