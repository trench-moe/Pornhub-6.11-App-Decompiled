package com.app.pornhub.view.user;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import com.app.pornhub.domain.model.comment.UserComment;
import java.util.ArrayList;
import java.util.Objects;
import t3.l;

/* loaded from: classes.dex */
public class b extends RecyclerView.Adapter<RecyclerView.z> {
    public Context d;

    /* renamed from: e  reason: collision with root package name */
    public InterfaceC0063b f5530e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<UserComment> f5531f = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: c  reason: collision with root package name */
        public int f5532c;

        public a(int i10) {
            this.f5532c = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!l.d(b.this.f5531f.get(this.f5532c).getUser())) {
                b bVar = b.this;
                InterfaceC0063b interfaceC0063b = bVar.f5530e;
                UserComment userComment = bVar.f5531f.get(this.f5532c);
                ProfileFragment profileFragment = (ProfileFragment) interfaceC0063b;
                Objects.requireNonNull(profileFragment);
                if (!userComment.getUser().getId().equals(profileFragment.f5484r0.a())) {
                    profileFragment.I0(ProfileActivity.C(profileFragment.q(), userComment.getUser()));
                }
            }
        }
    }

    /* renamed from: com.app.pornhub.view.user.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0063b {
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.z {

        /* renamed from: u  reason: collision with root package name */
        public View f5534u;

        /* renamed from: v  reason: collision with root package name */
        public ImageView f5535v;

        /* renamed from: w  reason: collision with root package name */
        public TextView f5536w;

        /* renamed from: x  reason: collision with root package name */
        public TextView f5537x;
        public TextView y;

        public c(View view) {
            super(view);
            this.f5534u = view;
            this.f5535v = (ImageView) view.findViewById(R.id.user_avatar);
            this.f5536w = (TextView) view.findViewById(R.id.user_name);
            this.f5537x = (TextView) view.findViewById(R.id.comment_txt);
            this.y = (TextView) view.findViewById(R.id.comment_age);
        }
    }

    public b(Context context, InterfaceC0063b interfaceC0063b) {
        this.d = context.getApplicationContext();
        this.f5530e = interfaceC0063b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int a() {
        return this.f5531f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void h(RecyclerView.z zVar, int i10) {
        UserComment userComment = this.f5531f.get(i10);
        c cVar = (c) zVar;
        com.bumptech.glide.b.e(cVar.f5535v).o(userComment.getUser().getUrlThumbnail()).A(cVar.f5535v);
        cVar.f5536w.setText(userComment.getUser().getUsername());
        cVar.f5537x.setText(userComment.getText());
        cVar.y.setText(a0.b.x(userComment.getDateAdded()));
        cVar.f5534u.setOnClickListener(new a(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.z i(ViewGroup viewGroup, int i10) {
        return new c(View.inflate(this.d, R.layout.user_profile_wall_comment, null));
    }
}
