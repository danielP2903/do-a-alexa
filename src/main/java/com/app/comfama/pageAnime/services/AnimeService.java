package com.app.comfama.pageAnime.services;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.catalina.connector.Response;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import com.app.comfama.pageAnime.constants.serviceImpl.AnimeServiceImpl;
import com.app.comfama.pageAnime.dtos.Data;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

@Service
public class AnimeService implements AnimeServiceImpl {
	String json = "", dto = null;
	@SuppressWarnings("deprecation")
	HttpClient httpclient = new DefaultHttpClient();
	HttpResponse response = null;
	StringEntity stringEntity = null;

	@Override
	public String getAnimes(int id) {

		try {
			HttpGet httpGet = new HttpGet("https://api.jikan.moe/v4/anime/" + id);
			response = httpclient.execute(httpGet);
			if ((response.getStatusLine().getStatusCode() + "").equals("200")) {
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(response.getEntity().getContent(), "UTF-8"));
				json = reader.readLine();
				
			//	Gson g = new Gson();  
			//	Data s =  new ObjectMapper().readValue(json, Data.class);
			//	System.out.println(s.toString());
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return json;
	}

}
