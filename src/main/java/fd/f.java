package fd;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64OutputStream;
import android.util.DisplayMetrics;
import android.util.JsonWriter;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import cd.g;
import cd.h;
import e.p;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.KotlinVersion;
import org.json.JSONObject;

@TargetApi(16)
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final cd.c f9558a;

    /* renamed from: c  reason: collision with root package name */
    public final List<fd.c> f9560c;

    /* renamed from: f  reason: collision with root package name */
    public final g f9562f;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f9561e = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    public final c f9559b = new c();
    public final b d = new b(KotlinVersion.MAX_COMPONENT_VALUE);

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: b  reason: collision with root package name */
        public final Paint f9564b = new Paint(2);

        /* renamed from: a  reason: collision with root package name */
        public Bitmap f9563a = null;
    }

    /* loaded from: classes.dex */
    public static class b extends LruCache<Class<?>, String> {
        public b(int i10) {
            super(i10);
        }

        @Override // android.util.LruCache
        public String create(Class<?> cls) {
            return cls.getCanonicalName();
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Callable<List<d>> {

        /* renamed from: c  reason: collision with root package name */
        public p f9565c;

        /* renamed from: j  reason: collision with root package name */
        public final DisplayMetrics f9567j = new DisplayMetrics();

        /* renamed from: f  reason: collision with root package name */
        public final List<d> f9566f = new ArrayList();

        /* renamed from: m  reason: collision with root package name */
        public final a f9568m = new a();

        /* JADX WARN: Removed duplicated region for block: B:31:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0173  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0177  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.util.concurrent.Callable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.util.List<fd.f.d> call() {
            /*
                Method dump skipped, instructions count: 401
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: fd.f.c.call():java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f9569a;

        /* renamed from: b  reason: collision with root package name */
        public final View f9570b;

        /* renamed from: c  reason: collision with root package name */
        public a f9571c = null;
        public float d = 1.0f;

        public d(String str, View view) {
            this.f9569a = str;
            this.f9570b = view;
        }
    }

    public f(Context context, List<fd.c> list, g gVar) {
        this.f9558a = cd.c.b(context);
        this.f9560c = list;
        this.f9562f = gVar;
    }

    public final void a(JsonWriter jsonWriter, View view) {
        View childAt;
        fd.a aVar;
        Object a10;
        if (view.getVisibility() == 4 && this.f9558a.f4051v) {
            return;
        }
        int id2 = view.getId();
        String str = -1 == id2 ? null : ((h) this.f9562f).f4074b.get(id2);
        jsonWriter.beginObject();
        jsonWriter.name("hashCode").value(view.hashCode());
        jsonWriter.name("id").value(id2);
        jsonWriter.name("mp_id_name").value(str);
        CharSequence contentDescription = view.getContentDescription();
        if (contentDescription == null) {
            jsonWriter.name("contentDescription").nullValue();
        } else {
            jsonWriter.name("contentDescription").value(contentDescription.toString());
        }
        Object tag = view.getTag();
        if (tag == null) {
            jsonWriter.name("tag").nullValue();
        } else if (tag instanceof CharSequence) {
            jsonWriter.name("tag").value(tag.toString());
        }
        jsonWriter.name("top").value(view.getTop());
        jsonWriter.name("left").value(view.getLeft());
        jsonWriter.name("width").value(view.getWidth());
        jsonWriter.name("height").value(view.getHeight());
        jsonWriter.name("scrollX").value(view.getScrollX());
        jsonWriter.name("scrollY").value(view.getScrollY());
        jsonWriter.name("visibility").value(view.getVisibility());
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        jsonWriter.name("translationX").value(translationX);
        jsonWriter.name("translationY").value(translationY);
        jsonWriter.name("classes");
        jsonWriter.beginArray();
        Class<?> cls = view.getClass();
        do {
            jsonWriter.value(this.d.get(cls));
            cls = cls.getSuperclass();
            if (cls == Object.class) {
                break;
            }
        } while (cls != null);
        jsonWriter.endArray();
        Class<?> cls2 = view.getClass();
        for (fd.c cVar : this.f9560c) {
            if (cVar.f9556b.isAssignableFrom(cls2) && (aVar = cVar.f9557c) != null && (a10 = aVar.a(view, aVar.f9544b)) != null) {
                if (a10 instanceof Number) {
                    jsonWriter.name(cVar.f9555a).value((Number) a10);
                } else if (a10 instanceof Boolean) {
                    jsonWriter.name(cVar.f9555a).value(((Boolean) a10).booleanValue());
                } else if (a10 instanceof ColorStateList) {
                    jsonWriter.name(cVar.f9555a).value(Integer.valueOf(((ColorStateList) a10).getDefaultColor()));
                } else if (a10 instanceof Drawable) {
                    Drawable drawable = (Drawable) a10;
                    Rect bounds = drawable.getBounds();
                    jsonWriter.name(cVar.f9555a);
                    jsonWriter.beginObject();
                    jsonWriter.name("classes");
                    jsonWriter.beginArray();
                    for (Class<?> cls3 = drawable.getClass(); cls3 != Object.class; cls3 = cls3.getSuperclass()) {
                        jsonWriter.value(cls3.getCanonicalName());
                    }
                    jsonWriter.endArray();
                    jsonWriter.name("dimensions");
                    jsonWriter.beginObject();
                    jsonWriter.name("left").value(bounds.left);
                    jsonWriter.name("right").value(bounds.right);
                    jsonWriter.name("top").value(bounds.top);
                    jsonWriter.name("bottom").value(bounds.bottom);
                    jsonWriter.endObject();
                    if (drawable instanceof ColorDrawable) {
                        jsonWriter.name("color").value(((ColorDrawable) drawable).getColor());
                    }
                    jsonWriter.endObject();
                } else {
                    jsonWriter.name(cVar.f9555a).value(a10.toString());
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            int[] rules = ((RelativeLayout.LayoutParams) layoutParams).getRules();
            jsonWriter.name("layoutRules");
            jsonWriter.beginArray();
            for (int i10 : rules) {
                jsonWriter.value(i10);
            }
            jsonWriter.endArray();
        }
        jsonWriter.name("subviews");
        jsonWriter.beginArray();
        boolean z10 = view instanceof ViewGroup;
        if (z10) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (viewGroup.getChildAt(i11) != null) {
                    jsonWriter.value(childAt.hashCode());
                }
            }
        }
        jsonWriter.endArray();
        jsonWriter.endObject();
        if (z10) {
            ViewGroup viewGroup2 = (ViewGroup) view;
            int childCount2 = viewGroup2.getChildCount();
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt2 = viewGroup2.getChildAt(i12);
                if (childAt2 != null) {
                    a(jsonWriter, childAt2);
                }
            }
        }
    }

    public void b(p pVar, OutputStream outputStream) {
        this.f9559b.f9565c = pVar;
        FutureTask futureTask = new FutureTask(this.f9559b);
        this.f9561e.post(futureTask);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        List emptyList = Collections.emptyList();
        outputStreamWriter.write("[");
        try {
            emptyList = (List) futureTask.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            cb.e.z("MixpanelAPI.Snapshot", "Screenshot interrupted, no screenshot will be sent.", e10);
        } catch (ExecutionException e11) {
            cb.e.D("MixpanelAPI.Snapshot", "Exception thrown during screenshot attempt", e11);
        } catch (TimeoutException e12) {
            cb.e.N("MixpanelAPI.Snapshot", "Screenshot took more than 1 second to be scheduled and executed. No screenshot will be sent.", e12);
        }
        int size = emptyList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                outputStreamWriter.write(",");
            }
            d dVar = (d) emptyList.get(i10);
            outputStreamWriter.write("{");
            outputStreamWriter.write("\"activity\":");
            outputStreamWriter.write(JSONObject.quote(dVar.f9569a));
            outputStreamWriter.write(",");
            outputStreamWriter.write("\"scale\":");
            outputStreamWriter.write(String.format("%s", Float.valueOf(dVar.d)));
            outputStreamWriter.write(",");
            outputStreamWriter.write("\"serialized_objects\":");
            JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
            jsonWriter.beginObject();
            jsonWriter.name("rootObject").value(dVar.f9570b.hashCode());
            jsonWriter.name("objects");
            View view = dVar.f9570b;
            jsonWriter.beginArray();
            a(jsonWriter, view);
            jsonWriter.endArray();
            jsonWriter.endObject();
            jsonWriter.flush();
            outputStreamWriter.write(",");
            outputStreamWriter.write("\"screenshot\":");
            outputStreamWriter.flush();
            a aVar = dVar.f9571c;
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
            synchronized (aVar) {
                Bitmap bitmap = aVar.f9563a;
                if (bitmap != null && bitmap.getWidth() != 0) {
                    if (aVar.f9563a.getHeight() != 0) {
                        outputStream.write(34);
                        Base64OutputStream base64OutputStream = new Base64OutputStream(outputStream, 2);
                        aVar.f9563a.compress(Bitmap.CompressFormat.PNG, 100, base64OutputStream);
                        base64OutputStream.flush();
                        outputStream.write(34);
                    }
                }
                outputStream.write("null".getBytes());
            }
            outputStreamWriter.write("}");
        }
        outputStreamWriter.write("]");
        outputStreamWriter.flush();
    }
}
