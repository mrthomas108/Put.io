package com.stevenschoen.putionew.model.responses;

import com.stevenschoen.putionew.model.files.PutioMp4Status;

public class Mp4StatusResponse extends BasePutioResponse {
	private PutioMp4Status mp4;

	public PutioMp4Status getMp4Status() {
		return mp4;
	}
}
