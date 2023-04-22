package com.app.pornhub.view.photos;

import a5.e;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.app.pornhub.R;
import com.app.pornhub.domain.model.photo.Album;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.view.common.widget.FlowLayout;
import com.app.pornhub.view.home.HomeActivity;
import com.app.pornhub.view.user.ProfileActivity;
import com.appsflyer.oaid.BuildConfig;
import f3.k;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class AlbumDetailsActivity extends v3.b {
    public k K;
    public Album L;
    public String M = BuildConfig.FLAVOR;
    public LinearLayout N;
    public FlowLayout O;
    public ImageView P;
    public TextView Q;
    public TextView R;
    public TextView S;
    public TextView T;

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b(a aVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AlbumDetailsActivity albumDetailsActivity = AlbumDetailsActivity.this;
            albumDetailsActivity.startActivity(ProfileActivity.C(albumDetailsActivity.getApplicationContext(), albumDetailsActivity.L.getUser()));
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c(a aVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AlbumDetailsActivity context = AlbumDetailsActivity.this;
            String keyword = (String) ((TextView) view).getText();
            Objects.requireNonNull(context);
            t3.a.y("album_tag");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(keyword, "keyword");
            Intent intent = new Intent(context, HomeActivity.class);
            intent.setAction("HomeActivity.Search");
            intent.putExtra("keyword", keyword);
            intent.putExtra("destination", R.id.photosFragment);
            intent.addFlags(67108864);
            context.startActivity(intent);
        }
    }

    public static Intent C(Context context, Album album, boolean z10) {
        Intent intent = new Intent(context, AlbumDetailsActivity.class);
        intent.putExtra("key_album", album);
        intent.putExtra("album_type", z10 ? PhotosType.PRIVATE : PhotosType.ALBUM);
        return intent;
    }

    @Override // y4.b, androidx.fragment.app.o, androidx.core.mh.ComponentActivity, b0.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_albumdetails);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            x().x(toolbar);
            y().n(false);
            y().m(true);
        }
        UserMetaData a10 = this.K.a();
        if (a10 != null) {
            this.M = a10.getId();
        }
        this.L = (Album) getIntent().getSerializableExtra("key_album");
        this.N = (LinearLayout) findViewById(R.id.fragment_album_header_llyTags);
        this.O = (FlowLayout) findViewById(R.id.fragment_album_header_flowlayoutTags);
        this.P = (ImageView) findViewById(R.id.fragment_album_header_imgUserThumbnail);
        this.Q = (TextView) findViewById(R.id.fragment_album_header_txtUsername);
        this.R = (TextView) findViewById(R.id.fragment_album_header_txtViewCount);
        this.S = (TextView) findViewById(R.id.fragment_album_header_txtDate);
        this.T = (TextView) findViewById(R.id.fragment_album_txtTitle);
        UserMetaData user = this.L.getUser();
        this.Q.setText(user.getUsername());
        this.Q.setOnClickListener(new b(null));
        com.bumptech.glide.b.f(this).o(user.getUrlThumbnail()).j(R.drawable.thumb_preview).i(m9.a.p(50), m9.a.p(50)).A(this.P);
        List asList = Arrays.asList(this.L.getTags().split(","));
        if (asList.size() > 0) {
            this.N.setVisibility(0);
            Collections.shuffle(asList);
            for (int i10 = 0; i10 < 8 && i10 < asList.size(); i10++) {
                TextView textView = (TextView) getLayoutInflater().inflate(R.layout.textview_tags, (ViewGroup) null);
                textView.setText((CharSequence) asList.get(i10));
                textView.setOnClickListener(new c(null));
                this.O.addView(textView);
            }
        } else {
            this.N.setVisibility(8);
        }
        this.R.setText(Integer.toString(this.L.getViewCount()));
        this.S.setText(a0.b.x(this.L.getDateAdded()));
        this.T.setText(String.format(getString(R.string.album_details_albumname), this.L.getTitle()));
        Bundle bundle2 = new Bundle();
        PhotosType photosType = (PhotosType) getIntent().getSerializableExtra("album_type");
        bundle2.putSerializable("photos_type", photosType);
        bundle2.putString("album_id", this.L.getId());
        e eVar = new e();
        eVar.A0(bundle2);
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(u());
        aVar.i(R.id.activity_albumdetails_fragmentContainer, eVar, e.I0);
        aVar.d();
        boolean z10 = !this.M.equals(this.L.getUser().getId());
        int ordinal = photosType.ordinal();
        if (ordinal == 0) {
            t3.a.x(this, "Album", z10 ? "MyPhotos" : "UserPhotos");
        } else if (ordinal == 2) {
            t3.a.x(this, "Album", "MyPhotosPrivate");
        }
    }
}
