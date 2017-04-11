package com.app.dao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Trackinfo;

@Service

public class TrackinfoServiceImply implements TrackinfoService {
	
	@Autowired
	private TrackinfoDAO TrackinfoDAO;
	
	@Override
	@Transactional
	public void addTrackinfo(Trackinfo Trackinfo) {
		TrackinfoDAO.addTrackinfo(Trackinfo);
	}

	@Override
	@Transactional
	public Collection<Trackinfo> listTrackinfo() {
		return TrackinfoDAO.listTrackinfo();
	}

	@Override
	@Transactional
	public Trackinfo getTrackinfo(int id) {
		return TrackinfoDAO.getTrackinfo(id);
	}

	@Override
	@Transactional
	public void deleteTrackinfo(int id) {
		TrackinfoDAO.deleteTrackinfo(id);
	}
}
