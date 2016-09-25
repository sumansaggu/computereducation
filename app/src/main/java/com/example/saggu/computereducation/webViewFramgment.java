package com.example.saggu.computereducation;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Saggu on 9/15/2016.
 */
public class webViewFramgment extends Fragment {


    String webUrl = "http://saggusuman.comuf.com/computerbasics/welcome/" ;
    String curUrl;
    WebView webView;

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        curUrl = webView.getUrl();
        outState.putString("url",curUrl);
        Log.d("debug","on save started");

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View WebView = inflater.inflate(R.layout.web_view_fragment,container,false);
        webView = (WebView) WebView.findViewById(R.id.my_webView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        if(curUrl == null){

            webView.loadUrl(webUrl);
        }
        else {

            webView.loadUrl(curUrl);
        }



        webView.setWebViewClient(new WebViewClient());
        curUrl = webView.getUrl();
        setRetainInstance(true);

        return WebView;


    }

}
