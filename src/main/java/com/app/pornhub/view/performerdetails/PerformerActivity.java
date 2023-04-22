package com.app.pornhub.view.performerdetails;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g0;
import androidx.fragment.app.y;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ActivityPerformerBinding;
import com.app.pornhub.domain.config.PerformersConfig;
import com.app.pornhub.view.common.widget.IconTabLayout;
import com.google.android.material.tabs.TabLayout;
import i4.g;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import u3.c;

/* loaded from: classes.dex */
public class PerformerActivity extends v3.b {
    public static final /* synthetic */ int P = 0;
    public int[] K = {R.drawable.ic_drawer_camera, R.drawable.ic_info, R.drawable.ic_drawer_photos, R.drawable.ic_comment};
    public int[] L = {R.drawable.ic_camera_white, R.drawable.ic_info_white, R.drawable.ic_photos_white, R.drawable.ic_comment_white};
    public z.b M;
    public com.app.pornhub.view.performerdetails.a N;
    public ActivityPerformerBinding O;

    /* loaded from: classes.dex */
    public class a extends g0 implements IconTabLayout.b {
        public a(y yVar) {
            super(yVar);
        }

        @Override // com.app.pornhub.view.common.widget.IconTabLayout.b
        public Drawable a(Context context, int i10) {
            return PerformerActivity.this.getResources().getDrawable(PerformerActivity.this.L[i10]);
        }

        @Override // com.app.pornhub.view.common.widget.IconTabLayout.b
        public Drawable b(Context context, int i10) {
            return PerformerActivity.this.getResources().getDrawable(PerformerActivity.this.K[i10]);
        }

        @Override // y1.a
        public int e() {
            return 2;
        }

        @Override // y1.a
        public CharSequence f(int i10) {
            return null;
        }

        @Override // androidx.fragment.app.g0
        public Fragment m(int i10) {
            return i10 == 0 ? new b() : new z4.b();
        }
    }

    public static Intent C(Context context, String str, PerformersConfig.PerformerType performerType) {
        Intent intent = new Intent();
        intent.setClass(context, PerformerActivity.class);
        intent.putExtra("slug", str);
        intent.putExtra("type", PerformersConfig.serializePerformerType(performerType));
        return intent;
    }

    @Override // v3.b, y4.a
    public void i() {
    }

    @Override // androidx.core.mh.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.O.f4447g.getVisibility() == 0) {
            this.O.f4447g.setVisibility(8);
        } else {
            this.f1829t.b();
        }
    }

    @Override // y4.b, androidx.fragment.app.o, androidx.core.mh.ComponentActivity, b0.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityPerformerBinding inflate = ActivityPerformerBinding.inflate(getLayoutInflater());
        this.O = inflate;
        setContentView(inflate.f4442a);
        this.O.f4443b.f4843c.setOnClickListener(new x3.b(this, 12));
        this.O.f4443b.f4842b.setOnClickListener(new u3.b(this, 10));
        this.O.f4444c.f4698a.setOnClickListener(new c(this, 12));
        TextView textView = (TextView) this.O.f4450j.findViewById(R.id.toolbar_title);
        if (textView != null) {
            textView.setText(R.string.pornstars);
        }
        A(this.O.f4450j);
        if (y() != null) {
            y().m(true);
            y().n(false);
        }
        ((TabLayout) findViewById(R.id.tab_layout)).setupWithViewPager(this.O.f4446f);
        this.O.f4448h.setLayoutManager(new LinearLayoutManager(1, false));
        String slug = getIntent().getStringExtra("slug");
        PerformersConfig.PerformerType type = PerformersConfig.deserializePerformerType(getIntent().getStringExtra("type"));
        com.app.pornhub.view.performerdetails.a aVar = (com.app.pornhub.view.performerdetails.a) new z(this, this.M).a(com.app.pornhub.view.performerdetails.a.class);
        this.N = aVar;
        Objects.requireNonNull(aVar);
        Intrinsics.checkNotNullParameter(slug, "slug");
        Intrinsics.checkNotNullParameter(type, "type");
        if (aVar.f5412f.d() != null) {
            if (!Intrinsics.areEqual(aVar.f5416j, slug)) {
            }
            this.N.f5412f.f(this, new g(this, 4));
            this.N.f5414h.f(this, new g4.c(this, 6));
            t3.a.u("Pornstar");
        }
        aVar.f5417k = type;
        aVar.c(slug, 0);
        this.N.f5412f.f(this, new g(this, 4));
        this.N.f5414h.f(this, new g4.c(this, 6));
        t3.a.u("Pornstar");
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
