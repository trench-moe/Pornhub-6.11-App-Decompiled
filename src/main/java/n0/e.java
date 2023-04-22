package n0;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final a f13139a;

    /* loaded from: classes2.dex */
    public interface a {
    }

    /* loaded from: classes2.dex */
    public static class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final GestureDetector f13140a;

        public b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f13140a = new GestureDetector(context, onGestureListener, handler);
        }
    }

    public e(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f13139a = new b(context, onGestureListener, null);
    }
}
