package s6;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class z extends SQLiteOpenHelper {

    /* renamed from: j  reason: collision with root package name */
    public static final String f14906j;

    /* renamed from: m  reason: collision with root package name */
    public static int f14907m;
    public static final a n;

    /* renamed from: t  reason: collision with root package name */
    public static final a f14908t;

    /* renamed from: u  reason: collision with root package name */
    public static final a f14909u;

    /* renamed from: w  reason: collision with root package name */
    public static final a f14910w;
    public static final a y;

    /* renamed from: z  reason: collision with root package name */
    public static final List<a> f14911z;

    /* renamed from: c  reason: collision with root package name */
    public final int f14912c;

    /* renamed from: f  reason: collision with root package name */
    public boolean f14913f;

    /* loaded from: classes2.dex */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        StringBuilder m10 = a1.a.m("INSERT INTO global_log_event_state VALUES (");
        m10.append(System.currentTimeMillis());
        m10.append(")");
        f14906j = m10.toString();
        f14907m = 5;
        u uVar = new a() { // from class: s6.u
            @Override // s6.z.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                String str = z.f14906j;
                sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
            }
        };
        n = uVar;
        v vVar = new a() { // from class: s6.v
            @Override // s6.z.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                String str = z.f14906j;
                sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
            }
        };
        f14908t = vVar;
        w wVar = new a() { // from class: s6.w
            @Override // s6.z.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                String str = z.f14906j;
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f14909u = wVar;
        x xVar = new a() { // from class: s6.x
            @Override // s6.z.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                String str = z.f14906j;
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
                sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
            }
        };
        f14910w = xVar;
        y yVar = new a() { // from class: s6.y
            @Override // s6.z.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                String str = z.f14906j;
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
                sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                sQLiteDatabase.execSQL(z.f14906j);
            }
        };
        y = yVar;
        f14911z = Arrays.asList(uVar, vVar, wVar, xVar, yVar);
    }

    public z(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f14913f = false;
        this.f14912c = i10;
    }

    public final void a(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List<a> list = f14911z;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                f14911z.get(i10).a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        StringBuilder o10 = a1.a.o("Migration from ", i10, " to ", i11, " was requested, but cannot be performed. Only ");
        o10.append(list.size());
        o10.append(" migrations are provided");
        throw new IllegalArgumentException(o10.toString());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f14913f = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i10 = this.f14912c;
        if (!this.f14913f) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, i10);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.f14913f) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f14913f) {
            onConfigure(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (!this.f14913f) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, i10, i11);
    }
}
