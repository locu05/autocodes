package com.csform.android.uiapptemplate;

import java.util.ArrayList;
import java.util.List;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.csform.android.uiapptemplate.adapter.DrawerAdapter;
import com.csform.android.uiapptemplate.fragment.CheckAndRadioBoxesFragment;
import com.csform.android.uiapptemplate.fragment.DialogFragment;
import com.csform.android.uiapptemplate.fragment.ImageGalleryFragment;
import com.csform.android.uiapptemplate.fragment.LeftMenusFragment;
import com.csform.android.uiapptemplate.fragment.ListViewsFragment;
import com.csform.android.uiapptemplate.fragment.LogInPageFragment;
import com.csform.android.uiapptemplate.fragment.ParallaxEffectsFragment;
import com.csform.android.uiapptemplate.fragment.ProgressBarsFragment;
import com.csform.android.uiapptemplate.fragment.SearchBarsFragment;
import com.csform.android.uiapptemplate.fragment.ShapeImageViewsFragment;
import com.csform.android.uiapptemplate.fragment.SplashScreensFragment;
import com.csform.android.uiapptemplate.fragment.TabsFragment;
import com.csform.android.uiapptemplate.fragment.TextViewsFragment;
import com.csform.android.uiapptemplate.fragment.WizardFragment;
import com.csform.android.uiapptemplate.model.DrawerItem;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import android.content.Intent;

public class MainActivity extends ActionBarActivity {

	private ListView mDrawerList;
	private List<DrawerItem> mDrawerItems;
	private DrawerLayout mDrawerLayout;
	private ActionBarDrawerToggle mDrawerToggle;

	private CharSequence mDrawerTitle;
	private CharSequence mTitle;

	private Handler mHandler;

	private boolean mShouldFinish = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ImageLoader imageLoader = ImageLoader.getInstance();
		if (!imageLoader.isInited()) {
			imageLoader.init(ImageLoaderConfiguration.createDefault(this));
		}

	}

	@Override
	public void setTitle(int titleId) {
		setTitle(getString(titleId));
	}

	@Override
	public void setTitle(CharSequence title) {
		mTitle = title;
		getSupportActionBar().setTitle(mTitle);
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		Intent intent = new Intent(this, GoogleCardsShopActivity.class);
		startActivity(intent);
	}
}