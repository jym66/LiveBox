package com.livebox.index;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;


import android.content.Context;


import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TableLayout;


import com.Service.indexService;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.gson.JsonArray;

import com.google.gson.JsonParser;
import com.hookpms.ServiceManagerWraper;
import com.scwang.smart.refresh.layout.api.RefreshLayout;

import com.scwang.smart.refresh.layout.listener.OnRefreshListener;
import com.util.BaseUrl;
import com.util.RetrofitManager;


import java.io.IOException;
import java.util.HashMap;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {
//    private RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(this);
//    int spanCount = 2; // 3 columns
//    int spacing = 30; // 50px
//    boolean includeEdge = false;
//    private boolean State;
//    private int page =1;
    private String[] tabs = {"斗鱼","哔哩哔哩","企鹅电竞"};
    private FragmentStateAdapter pagerAdapter;
    private  int spanCount;
//    private Fragment fragment;
    @Override
    protected void attachBaseContext(Context base) {
        ServiceManagerWraper.hookPMS(base,"3082036130820249a0030201020204584ebf41300d06092a864886f70d01010b05003060310e300c06035504061305646f757975310e300c06035504081305646f757975310e300c06035504071305646f757975310e300c060355040a1305646f757975310e300c060355040b1305646f757975310e300c06035504031305646f7579753020170d3134303331343031313735395a180f32313134303231383031313735395a3060310e300c06035504061305646f757975310e300c06035504081305646f757975310e300c06035504071305646f757975310e300c060355040a1305646f757975310e300c060355040b1305646f757975310e300c06035504031305646f75797530820122300d06092a864886f70d01010105000382010f003082010a0282010100ab2af09b368ea3e8aa883e16332701f527acf736f4a2a3880492ea70845273202c866a3de11900770d973b48e1105ca1171268430d84760fe68f97950093d0d5727a57a77b68b208e52823eebf9c2c1ffb327662eeeb8edb2f03e010bcd887486cdfe8af86919c53fbb1de464bdf6135222175d270a24341ba132d6e093d9655fcf5d8d15756cb3286f58a19f717203495939b3151d4ca618bac16ec6a27573022b500585b41bf6d3fdda3e5074baa8c3aabb33d5cab1ddc868738d7df57efb57626a2fd85d707e8a1a208b3397a90037176604d755f37dc9c5a7223e5f90d814bdf7d4e573366e1311654871b622111f403dd4c1b2fcb7d38933bd07c0aa73d0203010001a321301f301d0603551d0e041604142bdd239d28b1ac26523849d572a6b0d1a4cd2a64300d06092a864886f70d01010b05000382010100070049475bec62e1c2cdf5b86e36d8201768d2657c9b0fc2aca851ddf8904c8fc04bbde9a53be1262c5fb2cb36f325eb3e0e218283bf2dee6515a86d39a2e2bf67cf6676104ee31b669aec44b79d5a40cd432011e46b0453bad3deb01d206f954741b446dcce17b20d16a3b3372989eb1ec1827f0d68da0eb8564243c1a6d67ef27d9b557713c323bb61632ec64b630083cdc47f1dab7aae30746fe7c2856547bb355cdc7737e599817ac871572b8d4d02fd44ad584aa73af689beee77728f72a91882f5209defcce07387328c0e6958d4a1348483726bd91defa92aff15a6f95b16ee57ea0ab57280b298b8500592719b72c2a331f14242784421f367658a17");
        super.attachBaseContext(base);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout mTabLayout = findViewById(R.id.tab_layout);
        ViewPager2 viewPager2 = findViewById(R.id.pager);
        pagerAdapter = new ScreenSlidePagerAdapter(this);
        viewPager2.setAdapter(pagerAdapter);
        for (int i=0;i<tabs.length;i++){
            mTabLayout.addTab(mTabLayout.newTab().setText(tabs[i]));
        }
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(mTabLayout, viewPager2, (tab, position) -> tab.setText(tabs[position]));
        tabLayoutMediator.attach();
        mTabLayout.addOnTabSelectedListener(this);
//        if (isLandscape(this)){
//            spanCount=4;
//        }else {
//            spanCount=2;
//        }


    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {

        switch (tab.getPosition()){
            case 0:
                Data.tv="douyu";
                break;
            case 1:
                Data.tv="bilibili";
                break;
            case 2:
                Data.tv="egame";
                break;
        }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    private class ScreenSlidePagerAdapter extends FragmentStateAdapter {
        public ScreenSlidePagerAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch (position){
                case 0:
                    return new Fragment1();

                case 1:
                    return new Fragment2();

                case 2:
                    return new Fragment3();
            }
            return new Fragment1();
        }

        @Override
        public int getItemCount() {
            return tabs.length;
        }
    }



}


