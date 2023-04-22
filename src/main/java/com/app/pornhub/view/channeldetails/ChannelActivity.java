package com.app.pornhub.view.channeldetails;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d0;
import androidx.fragment.app.y;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ActivityChannelBinding;
import com.app.pornhub.domain.model.channel.ChannelContainer;
import com.google.android.material.tabs.TabLayout;
import f3.o;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import u1.f;
import v3.b;
import x3.d;

/* loaded from: classes.dex */
public class ChannelActivity extends b {
    public static final /* synthetic */ int O = 0;
    public f K;
    public o L;
    public ActivityChannelBinding M;
    public Disposable N;

    /* loaded from: classes.dex */
    public static class a extends d0 {

        /* renamed from: h  reason: collision with root package name */
        public String f4924h;

        /* renamed from: i  reason: collision with root package name */
        public List<String> f4925i;

        /* renamed from: j  reason: collision with root package name */
        public List<String> f4926j;

        public a(y yVar, ChannelContainer channelContainer) {
            super(yVar);
            this.f4925i = new ArrayList();
            this.f4926j = new ArrayList();
            this.f4924h = channelContainer.getChannel().getChannelMetaData().getId();
            this.f4925i.addAll(channelContainer.getOrders().values());
            this.f4926j.addAll(channelContainer.getOrders().keySet());
        }

        @Override // y1.a
        public int e() {
            return this.f4926j.size();
        }

        @Override // y1.a
        public CharSequence f(int i10) {
            return this.f4925i.get(i10);
        }

        @Override // androidx.fragment.app.d0
        public Fragment m(int i10) {
            String str = this.f4924h;
            d dVar = new d();
            Bundle bundle = new Bundle();
            bundle.putString("itemId", str);
            bundle.putString("order", this.f4926j.get(i10));
            dVar.A0(bundle);
            return dVar;
        }
    }

    public static Intent C(Context context, String str) {
        Intent intent = new Intent();
        intent.setClass(context, ChannelActivity.class);
        intent.putExtra("channel_id", str);
        return intent;
    }

    public final void D() {
        this.N = this.K.b(getIntent().getStringExtra("channel_id"), 0, null).subscribe(new x2.a(this, 5));
    }

    @Override // v3.b, y4.a
    public void i() {
    }

    @Override // y4.b, androidx.fragment.app.o, androidx.core.mh.ComponentActivity, b0.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityChannelBinding inflate = ActivityChannelBinding.inflate(getLayoutInflater());
        this.M = inflate;
        setContentView(inflate.f4360a);
        this.M.d.f4698a.setOnClickListener(new x3.a(this, 0));
        this.M.f4361b.f4838p.setOnClickListener(new x3.b(this, 0));
        TextView textView = (TextView) this.M.f4367i.findViewById(R.id.toolbar_title);
        if (textView != null) {
            textView.setText(R.string.channels);
        }
        A(this.M.f4367i);
        if (y() != null) {
            y().m(true);
            y().n(false);
        }
        ((TabLayout) findViewById(R.id.tab_layout)).setupWithViewPager(this.M.f4365g);
        D();
        t3.a.u("Channel");
    }

    @Override // y4.b, e.g, androidx.fragment.app.o, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Disposable disposable = this.N;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
