package com.app.dao;

import java.util.Collection;

import com.app.model.Trackinfo;



public interface TrackinfoDAO {
	public void addTrackinfo(Trackinfo Trackinfo);
	public Collection<Trackinfo> listTrackinfo();
	public Trackinfo getTrackinfo(int id);
	public void deleteTrackinfo(int id);
}
