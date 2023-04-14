package com.example.hellojapan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.lang.reflect.Array;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private MediaPlayer mediaPlayer;
    private Map<Integer, Integer> soundMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = new MediaPlayer();
        soundMap = new HashMap<>();
        soundMap.put(R.id.h_a, R.raw.h_a);
        soundMap.put(R.id.h_i, R.raw.h_i);
        soundMap.put(R.id.h_u, R.raw.h_u);
        soundMap.put(R.id.h_e, R.raw.h_e);
        soundMap.put(R.id.h_o, R.raw.h_o);
        soundMap.put(R.id.h_ka, R.raw.h_ka);
        soundMap.put(R.id.h_ki, R.raw.h_ki);
        soundMap.put(R.id.h_ku, R.raw.h_ku);
        soundMap.put(R.id.h_ke, R.raw.h_ke);
        soundMap.put(R.id.h_ko, R.raw.h_ko);
        soundMap.put(R.id.h_sa, R.raw.h_sa);
        soundMap.put(R.id.h_shi, R.raw.h_shi);
        soundMap.put(R.id.h_su, R.raw.h_su);
        soundMap.put(R.id.h_se, R.raw.h_se);
        soundMap.put(R.id.h_so, R.raw.h_so);
        soundMap.put(R.id.h_ta, R.raw.h_ta);
        soundMap.put(R.id.h_chi, R.raw.h_chi);
        soundMap.put(R.id.h_tsu, R.raw.h_tsu);
        soundMap.put(R.id.h_te, R.raw.h_te);
        soundMap.put(R.id.h_to, R.raw.h_to);
        soundMap.put(R.id.h_na, R.raw.h_na);
        soundMap.put(R.id.h_ni, R.raw.h_ni);
        soundMap.put(R.id.h_nu, R.raw.h_nu);
        soundMap.put(R.id.h_ne, R.raw.h_ne);
        soundMap.put(R.id.h_no, R.raw.h_no);
        soundMap.put(R.id.h_ha, R.raw.h_ha);
        soundMap.put(R.id.h_hi, R.raw.h_hi);
        soundMap.put(R.id.h_fu, R.raw.h_fu);
        soundMap.put(R.id.h_he, R.raw.h_he);
        soundMap.put(R.id.h_ho, R.raw.h_ho);
        soundMap.put(R.id.h_ma, R.raw.h_ma);
        soundMap.put(R.id.h_mi, R.raw.h_mi);
        soundMap.put(R.id.h_mu, R.raw.h_mu);
        soundMap.put(R.id.h_me, R.raw.h_me);
        soundMap.put(R.id.h_mo, R.raw.h_mo);
        soundMap.put(R.id.h_ya, R.raw.h_ya);
        soundMap.put(R.id.h_yu, R.raw.h_yu);
        soundMap.put(R.id.h_yo, R.raw.h_yo);
        soundMap.put(R.id.h_ra, R.raw.h_ra);
        soundMap.put(R.id.h_ri, R.raw.h_ri);
        soundMap.put(R.id.h_ru, R.raw.h_ru);
        soundMap.put(R.id.h_re, R.raw.h_re);
        soundMap.put(R.id.h_ro, R.raw.h_ro);
        soundMap.put(R.id.h_wa, R.raw.h_wa);
        soundMap.put(R.id.h_wo, R.raw.h_wo);
        soundMap.put(R.id.h_n, R.raw.h_n);
        // Set click listener for all ImageButtons
        for (int id : soundMap.keySet()) {
            ImageButton button = findViewById(id);
            button.setOnClickListener(this);
        }
        //define the button for each character
        ImageButton buttonHA = findViewById(R.id.h_a);
        ImageButton buttonHI = findViewById(R.id.h_i);
        ImageButton buttonHU = findViewById(R.id.h_u);
        ImageButton buttonHE = findViewById(R.id.h_e);
        ImageButton buttonHO = findViewById(R.id.h_o);
        ImageButton buttonHKA = findViewById(R.id.h_ka);
        ImageButton buttonHKI = findViewById(R.id.h_ki);
        ImageButton buttonHKU = findViewById(R.id.h_ku);
        ImageButton buttonHKE = findViewById(R.id.h_ke);
        ImageButton buttonHKO = findViewById(R.id.h_ko);
        ImageButton buttonHSA = findViewById(R.id.h_sa);
        ImageButton buttonHSHI = findViewById(R.id.h_shi);
        ImageButton buttonHSU = findViewById(R.id.h_su);
        ImageButton buttonHSE = findViewById(R.id.h_se);
        ImageButton buttonHSO = findViewById(R.id.h_so);
        ImageButton buttonHTA = findViewById(R.id.h_ta);
        ImageButton buttonHCHI = findViewById(R.id.h_chi);
        ImageButton buttonHTSU = findViewById(R.id.h_tsu);
        ImageButton buttonHTE = findViewById(R.id.h_te);
        ImageButton buttonHTO = findViewById(R.id.h_to);
        ImageButton buttonHNA = findViewById(R.id.h_na);
        ImageButton buttonHNI = findViewById(R.id.h_ni);
        ImageButton buttonHNU = findViewById(R.id.h_nu);
        ImageButton buttonHNE = findViewById(R.id.h_ne);
        ImageButton buttonHNO = findViewById(R.id.h_no);
        ImageButton buttonHHA = findViewById(R.id.h_ha);
        ImageButton buttonHHI = findViewById(R.id.h_hi);
        ImageButton buttonHFU = findViewById(R.id.h_fu);
        ImageButton buttonHHE = findViewById(R.id.h_he);
        ImageButton buttonHHO = findViewById(R.id.h_ho);
        ImageButton buttonHMA = findViewById(R.id.h_ma);
        ImageButton buttonHMI = findViewById(R.id.h_mi);
        ImageButton buttonHMU = findViewById(R.id.h_mu);
        ImageButton buttonHME = findViewById(R.id.h_me);
        ImageButton buttonHMO = findViewById(R.id.h_mo);
        ImageButton buttonHYA = findViewById(R.id.h_ya);
        ImageButton buttonHYU = findViewById(R.id.h_yu);
        ImageButton buttonHYO = findViewById(R.id.h_yo);
        ImageButton buttonHRA = findViewById(R.id.h_ra);
        ImageButton buttonHRI = findViewById(R.id.h_ri);
        ImageButton buttonHRU = findViewById(R.id.h_ru);
        ImageButton buttonHRE = findViewById(R.id.h_re);
        ImageButton buttonHRO = findViewById(R.id.h_ro);
        ImageButton buttonHWA = findViewById(R.id.h_wa);
        ImageButton buttonHWO = findViewById(R.id.h_wo);
        ImageButton buttonHN = findViewById(R.id.h_n);



        Button katakanabutton = findViewById(R.id.katakana_button);
        Button hiraganabutton = findViewById(R.id.hiragana_button);
        TextView titleBar = findViewById(R.id.titleBar);
        katakanabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                titleBar.setText(R.string.katakana);
                buttonHA.setImageResource(R.drawable.k_a);
                buttonHI.setImageResource(R.drawable.k_i);
                buttonHU.setImageResource(R.drawable.k_u);
                buttonHE.setImageResource(R.drawable.k_e);
                buttonHO.setImageResource(R.drawable.k_o);
                buttonHKA.setImageResource(R.drawable.k_ka);
                buttonHKI.setImageResource(R.drawable.k_ki);
                buttonHKU.setImageResource(R.drawable.k_ku);
                buttonHKE.setImageResource(R.drawable.k_ke);
                buttonHKO.setImageResource(R.drawable.k_ko);
                buttonHSA.setImageResource(R.drawable.k_sa);
                buttonHSHI.setImageResource(R.drawable.k_shi);
                buttonHSU.setImageResource(R.drawable.k_su);
                buttonHSE.setImageResource(R.drawable.k_se);
                buttonHSO.setImageResource(R.drawable.k_so);
                buttonHTA.setImageResource(R.drawable.k_ta);
                buttonHCHI.setImageResource(R.drawable.k_chi);
                buttonHTSU.setImageResource(R.drawable.k_tsu);
                buttonHTE.setImageResource(R.drawable.k_te);
                buttonHTO.setImageResource(R.drawable.k_to);
                buttonHNA.setImageResource(R.drawable.k_na);
                buttonHNI.setImageResource(R.drawable.k_ni);
                buttonHNU.setImageResource(R.drawable.k_nu);
                buttonHNE.setImageResource(R.drawable.k_ne);
                buttonHNO.setImageResource(R.drawable.k_no);
                buttonHHA.setImageResource(R.drawable.k_ha);
                buttonHHI.setImageResource(R.drawable.k_hi);
                buttonHFU.setImageResource(R.drawable.k_fu);
                buttonHE.setImageResource(R.drawable.k_he);
                buttonHO.setImageResource(R.drawable.k_ho);
                buttonHMA.setImageResource(R.drawable.k_ma);
                buttonHMI.setImageResource(R.drawable.k_mi);
                buttonHMU.setImageResource(R.drawable.k_mu);
                buttonHME.setImageResource(R.drawable.k_me);
                buttonHMO.setImageResource(R.drawable.k_mo);
                buttonHYA.setImageResource(R.drawable.k_ya);
                buttonHYU.setImageResource(R.drawable.k_yu);
                buttonHYO.setImageResource(R.drawable.k_yo);
                buttonHRA.setImageResource(R.drawable.k_ra);
                buttonHRI.setImageResource(R.drawable.k_ri);
                buttonHRU.setImageResource(R.drawable.k_ru);
                buttonHRE.setImageResource(R.drawable.k_re);
                buttonHRO.setImageResource(R.drawable.k_u);
                buttonHWA.setImageResource(R.drawable.k_wa);
                buttonHWO.setImageResource(R.drawable.k_wo);
                buttonHN.setImageResource(R.drawable.k_n);
            }
        });


        hiraganabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change the title bar
                titleBar.setText(R.string.hiragana);
                // change the style of switch

                buttonHA.setImageResource(R.drawable.h_a);
                buttonHI.setImageResource(R.drawable.h_i);
                buttonHU.setImageResource(R.drawable.h_u);
                buttonHE.setImageResource(R.drawable.h_e);
                buttonHO.setImageResource(R.drawable.h_o);
                buttonHKA.setImageResource(R.drawable.h_ka);
                buttonHKI.setImageResource(R.drawable.h_ki);
                buttonHKU.setImageResource(R.drawable.h_ku);
                buttonHKE.setImageResource(R.drawable.h_ke);
                buttonHKO.setImageResource(R.drawable.h_ko);
                buttonHSA.setImageResource(R.drawable.h_sa);
                buttonHSHI.setImageResource(R.drawable.h_shi);
                buttonHSU.setImageResource(R.drawable.h_su);
                buttonHSE.setImageResource(R.drawable.h_se);
                buttonHSO.setImageResource(R.drawable.h_so);
                buttonHTA.setImageResource(R.drawable.h_ta);
                buttonHCHI.setImageResource(R.drawable.h_chi);
                buttonHTSU.setImageResource(R.drawable.h_tsu);
                buttonHTE.setImageResource(R.drawable.h_te);
                buttonHTO.setImageResource(R.drawable.h_to);
                buttonHNA.setImageResource(R.drawable.h_na);
                buttonHNI.setImageResource(R.drawable.h_ni);
                buttonHNU.setImageResource(R.drawable.h_nu);
                buttonHNE.setImageResource(R.drawable.h_ne);
                buttonHNO.setImageResource(R.drawable.h_no);
                buttonHA.setImageResource(R.drawable.h_ha);
                buttonHI.setImageResource(R.drawable.h_hi);
                buttonHFU.setImageResource(R.drawable.h_fu);
                buttonHHE.setImageResource(R.drawable.h_he);
                buttonHHO.setImageResource(R.drawable.h_ho);
                buttonHMA.setImageResource(R.drawable.h_ma);
                buttonHMI.setImageResource(R.drawable.h_mi);
                buttonHMU.setImageResource(R.drawable.h_mu);
                buttonHME.setImageResource(R.drawable.h_me);
                buttonHMO.setImageResource(R.drawable.h_mo);
                buttonHYA.setImageResource(R.drawable.h_ya);
                buttonHYU.setImageResource(R.drawable.h_yu);
                buttonHYO.setImageResource(R.drawable.h_yo);
                buttonHRA.setImageResource(R.drawable.h_ra);
                buttonHRI.setImageResource(R.drawable.h_ri);
                buttonHRU.setImageResource(R.drawable.h_ru);
                buttonHRE.setImageResource(R.drawable.h_re);
                buttonHRO.setImageResource(R.drawable.h_ro);
                buttonHWA.setImageResource(R.drawable.h_wa);
                buttonHWO.setImageResource(R.drawable.h_wo);
                buttonHN.setImageResource(R.drawable.h_n);
            }
        });
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        int soundId = soundMap.get(id);
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer = MediaPlayer.create(this, soundId);
        mediaPlayer.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mediaPlayer.release();
    }
}