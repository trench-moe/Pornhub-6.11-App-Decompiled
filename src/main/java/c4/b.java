package c4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import c4.b;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ItemVideoCommentBinding;
import com.app.pornhub.domain.error.OperationException;
import com.app.pornhub.domain.model.comment.CommentActionResult;
import com.app.pornhub.domain.model.comment.UserComment;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.comments.ChildCommentsActivity;
import com.app.pornhub.view.user.ProfileActivity;
import com.google.android.material.snackbar.Snackbar;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Objects;
import t3.o;

/* loaded from: classes.dex */
public class b extends c4.a<c> {

    /* renamed from: e  reason: collision with root package name */
    public InterfaceC0049b f3729e;

    /* renamed from: f  reason: collision with root package name */
    public String f3730f;

    /* renamed from: g  reason: collision with root package name */
    public View.OnClickListener f3731g;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str = (String) view.getTag();
            switch (view.getId()) {
                case R.id.icon_delete /* 2131362416 */:
                    InterfaceC0049b interfaceC0049b = b.this.f3729e;
                    String valueOf = String.valueOf(str);
                    ChildCommentsActivity childCommentsActivity = (ChildCommentsActivity) interfaceC0049b;
                    childCommentsActivity.V.add(childCommentsActivity.P.a(valueOf, childCommentsActivity.Y).subscribe(new y3.b(childCommentsActivity, valueOf, 0)));
                    return;
                case R.id.icon_flag /* 2131362417 */:
                    InterfaceC0049b interfaceC0049b2 = b.this.f3729e;
                    String valueOf2 = String.valueOf(str);
                    ChildCommentsActivity childCommentsActivity2 = (ChildCommentsActivity) interfaceC0049b2;
                    childCommentsActivity2.V.add(childCommentsActivity2.N.a(valueOf2, childCommentsActivity2.Y).subscribe(new y3.a(childCommentsActivity2, valueOf2, 0)));
                    return;
                case R.id.img_vote_down /* 2131362453 */:
                    b.q(b.this, str, false);
                    return;
                case R.id.img_vote_up /* 2131362454 */:
                    b.q(b.this, str, true);
                    return;
                case R.id.user_name /* 2131363165 */:
                    UserComment r10 = b.this.r(str);
                    if (r10 != null) {
                        view.getContext().startActivity(ProfileActivity.C(view.getContext(), r10.getUser()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: c4.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0049b {
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public UserComment f3733a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3734b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f3735c;
        public boolean d;

        public c(UserComment userComment) {
            this.f3733a = userComment;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends RecyclerView.z {

        /* renamed from: u  reason: collision with root package name */
        public final ItemVideoCommentBinding f3736u;

        public d(ItemVideoCommentBinding itemVideoCommentBinding, View.OnClickListener onClickListener) {
            super(itemVideoCommentBinding.f4804a);
            this.f3736u = itemVideoCommentBinding;
            itemVideoCommentBinding.f4808f.setOnClickListener(onClickListener);
            itemVideoCommentBinding.f4807e.setOnClickListener(onClickListener);
            itemVideoCommentBinding.f4812j.setOnClickListener(onClickListener);
            itemVideoCommentBinding.f4811i.setOnClickListener(onClickListener);
            itemVideoCommentBinding.f4816o.setOnClickListener(onClickListener);
        }
    }

    public b(InterfaceC0049b interfaceC0049b, String str) {
        super(new ArrayList());
        this.f3731g = new a();
        this.f3729e = interfaceC0049b;
        this.f3730f = str;
    }

    public static void q(b bVar, String str, final boolean z10) {
        UserComment r10 = bVar.r(str);
        if (r10 == null || bVar.f3730f.equals(r10.getUser().getId())) {
            return;
        }
        InterfaceC0049b interfaceC0049b = bVar.f3729e;
        final String valueOf = String.valueOf(str);
        final ChildCommentsActivity childCommentsActivity = (ChildCommentsActivity) interfaceC0049b;
        childCommentsActivity.V.add(childCommentsActivity.O.b(valueOf, z10).subscribe(new Consumer() { // from class: y3.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ChildCommentsActivity childCommentsActivity2 = ChildCommentsActivity.this;
                String str2 = valueOf;
                boolean z11 = z10;
                UseCaseResult useCaseResult = (UseCaseResult) obj;
                int i10 = ChildCommentsActivity.Z;
                Objects.requireNonNull(childCommentsActivity2);
                if (useCaseResult instanceof UseCaseResult.a) {
                    childCommentsActivity2.U.t(str2, z11, true);
                } else {
                    childCommentsActivity2.U.t(str2, z11, false);
                }
                if (useCaseResult instanceof UseCaseResult.Result) {
                    if (((CommentActionResult) ((UseCaseResult.Result) useCaseResult).a()).getResult()) {
                        a1.a.t(childCommentsActivity2, R.string.comment_rated, childCommentsActivity2.T.f4375i, -1);
                        c4.b bVar2 = childCommentsActivity2.U;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= bVar2.d.size()) {
                                break;
                            }
                            UserComment userComment = ((b.c) bVar2.d.get(i11)).f3733a;
                            if (userComment.getId().equals(str2)) {
                                if (z11) {
                                    userComment.incrementVotesUp();
                                } else {
                                    userComment.incrementVotesDown();
                                }
                                bVar2.d(i11);
                            } else {
                                i11++;
                            }
                        }
                    } else {
                        a1.a.t(childCommentsActivity2, R.string.error_comment_rate, childCommentsActivity2.T.f4375i, -1);
                    }
                }
                if (useCaseResult instanceof UseCaseResult.Failure) {
                    Throwable a10 = ((UseCaseResult.Failure) useCaseResult).a();
                    kf.a.f12078a.d(a10, "Failed to rate comment id %s", str2);
                    if (a10 instanceof OperationException) {
                        Snackbar.l(childCommentsActivity2.T.f4375i, childCommentsActivity2.C((OperationException) a10), -1).n();
                    } else {
                        o.h(childCommentsActivity2, a10);
                    }
                }
            }
        }));
    }

    @Override // c4.a
    public void n(RecyclerView.z zVar, int i10) {
        d dVar = (d) zVar;
        c cVar = (c) this.d.get(i10);
        String str = this.f3730f;
        Objects.requireNonNull(dVar);
        UserComment userComment = cVar.f3733a;
        com.bumptech.glide.b.e(dVar.f3736u.n).o(userComment.getUser().getUrlThumbnail()).A(dVar.f3736u.n);
        dVar.f3736u.f4816o.setText(userComment.getUser().getUsername());
        dVar.f3736u.f4816o.setTag(userComment.getId());
        dVar.f3736u.f4809g.setVisibility(userComment.getUser().isVerified() ? 0 : 8);
        dVar.f3736u.f4805b.setText(a0.b.x(userComment.getDateAdded()));
        dVar.f3736u.f4806c.setText(userComment.getText());
        if (cVar.f3734b) {
            dVar.f3736u.f4820s.setVisibility(8);
            dVar.f3736u.f4821t.setVisibility(0);
        } else {
            dVar.f3736u.f4820s.setVisibility(0);
            dVar.f3736u.f4821t.setVisibility(4);
            dVar.f3736u.f4820s.setText(String.valueOf(userComment.getVotesUp()));
        }
        if (cVar.f3735c) {
            dVar.f3736u.f4818q.setVisibility(8);
            dVar.f3736u.f4819r.setVisibility(0);
        } else {
            dVar.f3736u.f4818q.setVisibility(0);
            dVar.f3736u.f4819r.setVisibility(4);
            dVar.f3736u.f4818q.setText(String.valueOf(userComment.getVotesDown()));
        }
        dVar.f3736u.f4812j.setTag(userComment.getId());
        dVar.f3736u.f4811i.setTag(userComment.getId());
        if (cVar.d) {
            dVar.f3736u.f4807e.setVisibility(4);
            dVar.f3736u.f4808f.setVisibility(4);
            dVar.f3736u.d.setVisibility(0);
        } else if (userComment.getUser().getId().equals(str)) {
            dVar.f3736u.f4807e.setTag(userComment.getId());
            dVar.f3736u.f4807e.setVisibility(0);
            dVar.f3736u.f4808f.setVisibility(4);
            dVar.f3736u.d.setVisibility(8);
        } else if (str.equals(userComment.getUser().getId())) {
            dVar.f3736u.f4808f.setVisibility(8);
            dVar.f3736u.d.setVisibility(8);
        } else {
            dVar.f3736u.f4808f.setTag(userComment.getId());
            dVar.f3736u.f4807e.setVisibility(4);
            dVar.f3736u.f4808f.setVisibility(0);
            dVar.f3736u.d.setVisibility(8);
        }
    }

    @Override // c4.a
    public RecyclerView.z o(ViewGroup viewGroup, int i10) {
        return new d(ItemVideoCommentBinding.a(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), this.f3731g);
    }

    public final UserComment r(String str) {
        for (T t2 : this.d) {
            if (t2.f3733a.getId().equals(str)) {
                return t2.f3733a;
            }
        }
        return null;
    }

    public void s(String str) {
        int i10 = 0;
        while (true) {
            if (i10 >= this.d.size()) {
                i10 = -1;
                break;
            } else if (((c) this.d.get(i10)).f3733a.getId().equals(str)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            this.d.remove(i10);
            f(i10);
        }
    }

    public void t(String str, boolean z10, boolean z11) {
        for (int i10 = 0; i10 < this.d.size(); i10++) {
            c cVar = (c) this.d.get(i10);
            if (cVar.f3733a.getId().equals(str)) {
                if (z10) {
                    cVar.f3734b = z11;
                } else {
                    cVar.f3735c = z11;
                }
                if (z11) {
                    this.f2802a.b();
                    return;
                } else {
                    d(i10);
                    return;
                }
            }
        }
    }

    public void u(String str, boolean z10) {
        for (int i10 = 0; i10 < this.d.size(); i10++) {
            c cVar = (c) this.d.get(i10);
            if (cVar.f3733a.getId().equals(str)) {
                cVar.d = z10;
                if (z10) {
                    this.f2802a.b();
                    return;
                } else {
                    d(i10);
                    return;
                }
            }
        }
    }
}
