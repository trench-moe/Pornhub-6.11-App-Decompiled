package b0;

import android.app.Notification;
import android.app.Person;
import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class n implements i {

    /* renamed from: a  reason: collision with root package name */
    public final Notification.Builder f3437a;

    /* renamed from: b  reason: collision with root package name */
    public final l f3438b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Bundle> f3439c = new ArrayList();
    public final Bundle d = new Bundle();

    public n(l lVar) {
        this.f3438b = lVar;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3437a = new Notification.Builder(lVar.f3416a, lVar.f3432s);
        } else {
            this.f3437a = new Notification.Builder(lVar.f3416a);
        }
        Notification notification = lVar.f3434u;
        this.f3437a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(lVar.f3419e).setContentText(lVar.f3420f).setContentInfo(null).setContentIntent(lVar.f3421g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setLargeIcon(lVar.f3422h).setNumber(0).setProgress(lVar.f3426l, lVar.f3427m, lVar.n);
        this.f3437a.setSubText(null).setUsesChronometer(false).setPriority(lVar.f3423i);
        Iterator<j> it = lVar.f3417b.iterator();
        while (it.hasNext()) {
            j next = it.next();
            int i10 = Build.VERSION.SDK_INT;
            IconCompat a10 = next.a();
            Notification.Action.Builder builder = i10 >= 23 ? new Notification.Action.Builder(a10 != null ? a10.g() : null, next.f3413j, next.f3414k) : new Notification.Action.Builder(a10 != null ? a10.c() : 0, next.f3413j, next.f3414k);
            q[] qVarArr = next.f3407c;
            if (qVarArr != null) {
                int length = qVarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                for (int i11 = 0; i11 < qVarArr.length; i11++) {
                    Objects.requireNonNull(qVarArr[i11]);
                    RemoteInput.Builder addExtras = new RemoteInput.Builder(null).setLabel(null).setChoices(null).setAllowFreeFormInput(false).addExtras(null);
                    if (Build.VERSION.SDK_INT >= 29) {
                        addExtras.setEditChoicesBeforeSending(0);
                    }
                    remoteInputArr[i11] = addExtras.build();
                }
                for (int i12 = 0; i12 < length; i12++) {
                    builder.addRemoteInput(remoteInputArr[i12]);
                }
            }
            Bundle bundle = next.f3405a != null ? new Bundle(next.f3405a) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", next.f3408e);
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 24) {
                builder.setAllowGeneratedReplies(next.f3408e);
            }
            bundle.putInt("android.support.action.semanticAction", next.f3410g);
            if (i13 >= 28) {
                builder.setSemanticAction(next.f3410g);
            }
            if (i13 >= 29) {
                builder.setContextual(next.f3411h);
            }
            bundle.putBoolean("android.support.action.showsUserInterface", next.f3409f);
            builder.addExtras(bundle);
            this.f3437a.addAction(builder.build());
        }
        Bundle bundle2 = lVar.f3429p;
        if (bundle2 != null) {
            this.d.putAll(bundle2);
        }
        int i14 = Build.VERSION.SDK_INT;
        this.f3437a.setShowWhen(lVar.f3424j);
        this.f3437a.setLocalOnly(lVar.f3428o).setGroup(null).setGroupSummary(false).setSortKey(null);
        this.f3437a.setCategory(null).setColor(lVar.f3430q).setVisibility(lVar.f3431r).setPublicVersion(null).setSound(notification.sound, notification.audioAttributes);
        List<String> a11 = i14 < 28 ? a(b(lVar.f3418c), lVar.f3435v) : lVar.f3435v;
        if (a11 != null && !a11.isEmpty()) {
            for (String str : a11) {
                this.f3437a.addPerson(str);
            }
        }
        if (lVar.d.size() > 0) {
            if (lVar.f3429p == null) {
                lVar.f3429p = new Bundle();
            }
            Bundle bundle3 = lVar.f3429p.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            for (int i15 = 0; i15 < lVar.d.size(); i15++) {
                String num = Integer.toString(i15);
                j jVar = lVar.d.get(i15);
                Object obj = o.f3440a;
                Bundle bundle6 = new Bundle();
                IconCompat a12 = jVar.a();
                bundle6.putInt("icon", a12 != null ? a12.c() : 0);
                bundle6.putCharSequence("title", jVar.f3413j);
                bundle6.putParcelable("actionIntent", jVar.f3414k);
                Bundle bundle7 = jVar.f3405a != null ? new Bundle(jVar.f3405a) : new Bundle();
                bundle7.putBoolean("android.support.allowGeneratedReplies", jVar.f3408e);
                bundle6.putBundle("extras", bundle7);
                bundle6.putParcelableArray("remoteInputs", o.a(jVar.f3407c));
                bundle6.putBoolean("showsUserInterface", jVar.f3409f);
                bundle6.putInt("semanticAction", jVar.f3410g);
                bundle5.putBundle(num, bundle6);
            }
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (lVar.f3429p == null) {
                lVar.f3429p = new Bundle();
            }
            lVar.f3429p.putBundle("android.car.EXTENSIONS", bundle3);
            this.d.putBundle("android.car.EXTENSIONS", bundle4);
        }
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 24) {
            this.f3437a.setExtras(lVar.f3429p).setRemoteInputHistory(null);
        }
        if (i16 >= 26) {
            this.f3437a.setBadgeIconType(0).setSettingsText(null).setShortcutId(null).setTimeoutAfter(0L).setGroupAlertBehavior(0);
            if (!TextUtils.isEmpty(lVar.f3432s)) {
                this.f3437a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i16 >= 28) {
            Iterator<p> it2 = lVar.f3418c.iterator();
            while (it2.hasNext()) {
                Notification.Builder builder2 = this.f3437a;
                Objects.requireNonNull(it2.next());
                builder2.addPerson(new Person.Builder().setName(null).setIcon(null).setUri(null).setKey(null).setBot(false).setImportant(false).build());
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3437a.setAllowSystemGeneratedContextualActions(lVar.f3433t);
            this.f3437a.setBubbleMetadata(null);
        }
        i0.a.a();
    }

    public static List<String> a(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        p.c cVar = new p.c(list2.size() + list.size());
        cVar.addAll(list);
        cVar.addAll(list2);
        return new ArrayList(cVar);
    }

    public static List<String> b(List<p> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (p pVar : list) {
            Objects.requireNonNull(pVar);
            arrayList.add(BuildConfig.FLAVOR);
        }
        return arrayList;
    }
}
