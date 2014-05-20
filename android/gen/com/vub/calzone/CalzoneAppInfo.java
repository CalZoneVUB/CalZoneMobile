package com.vub.calzone;

import org.appcelerator.titanium.ITiAppInfo;
import org.appcelerator.titanium.TiApplication;
import org.appcelerator.titanium.TiProperties;
import org.appcelerator.kroll.common.Log;

/* GENERATED CODE
 * Warning - this class was generated from your application's tiapp.xml
 * Any changes you make here will be overwritten
 */
public final class CalzoneAppInfo implements ITiAppInfo
{
	private static final String LCAT = "AppInfo";

	public CalzoneAppInfo(TiApplication app) {
	}

	public String getDeployType() {
		return "development";
	}

	public String getId() {
		return "com.vub.calzone";
	}

	public String getName() {
		return "CalZone";
	}

	public String getVersion() {
		return "1.0";
	}

	public String getPublisher() {
		return "christophegaethofs";
	}

	public String getUrl() {
		return "http://calzone.today";
	}

	public String getCopyright() {
		return "2014 by christophegaethofs";
	}

	public String getDescription() {
		return "not specified";
	}

	public String getIcon() {
		return "appicon.png";
	}

	public boolean isAnalyticsEnabled() {
		return true;
	}

	public String getGUID() {
		return "0829092c-2d30-4f54-89ca-0a30346cab05";
	}

	public boolean isFullscreen() {
		return false;
	}

	public boolean isNavBarHidden() {
		return false;
	}
}
