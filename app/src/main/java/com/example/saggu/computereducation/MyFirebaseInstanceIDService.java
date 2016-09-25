package com.example.saggu.computereducation;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Saggu on 9/17/2016.
 */
public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {


    
    private static final String TAG ="MyFirebaseInsIDService";



    @Override
    public void onTokenRefresh() {
        //get updated tokan
        String refreshedtokan = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG,"New Tokan:" + refreshedtokan);

        //we can save this tokan into any server to do anything
    }
}
