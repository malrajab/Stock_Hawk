package com.sam_chordas.android.stockhawk.controller.service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.gcm.TaskParams;

/**
 * Created by sam_chordas on 10/1/15.
 * Edited by M.Alrajab Aug/23/2016
 * adding a tag processing for the history of the stock
 */
public class StockIntentService extends IntentService {

    Context mContext;
  public StockIntentService(){
    super(StockIntentService.class.getName());

  }

  public StockIntentService(String name) {
    super(name);
  }

    @Override protected void onHandleIntent(Intent intent) {
    StockTaskService stockTaskService = new StockTaskService(this);
    Bundle args = new Bundle();
    if (intent.getStringExtra("tag").equals("add")){
      args.putString("symbol", intent.getStringExtra("symbol"));
    } else
 if (intent.getStringExtra("tag").equals("getGraphData")){
      args.putString("graphTicker", intent.getStringExtra("graphTicker"));
    }
     stockTaskService.onRunTask(new TaskParams(intent.getStringExtra("tag"), args));


  }
}
