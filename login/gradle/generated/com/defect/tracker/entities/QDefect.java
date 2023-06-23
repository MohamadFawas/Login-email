package com.defect.tracker.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDefect is a Querydsl query type for Defect
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDefect extends EntityPathBase<Defect> {

    private static final long serialVersionUID = 1493060152L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDefect defect = new QDefect("defect");

    public final QProjectAllocation assignTo;

    public final StringPath code = createString("code");

    public final StringPath describtion = createString("describtion");

    public final QRelease fixedIn;

    public final QProjectAllocation foundBy;

    public final QModule module;

    public final QPriority priority;

    public final QProject project;

    public final QRelease release;

    public final QSeverity severity;

    public final QDefectStatus status;

    public final StringPath stepToRecreate = createString("stepToRecreate");

    public final QSubModule subModule;

    public final QDefectType type;

    public QDefect(String variable) {
        this(Defect.class, forVariable(variable), INITS);
    }

    public QDefect(Path<? extends Defect> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDefect(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDefect(PathMetadata metadata, PathInits inits) {
        this(Defect.class, metadata, inits);
    }

    public QDefect(Class<? extends Defect> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.assignTo = inits.isInitialized("assignTo") ? new QProjectAllocation(forProperty("assignTo"), inits.get("assignTo")) : null;
        this.fixedIn = inits.isInitialized("fixedIn") ? new QRelease(forProperty("fixedIn")) : null;
        this.foundBy = inits.isInitialized("foundBy") ? new QProjectAllocation(forProperty("foundBy"), inits.get("foundBy")) : null;
        this.module = inits.isInitialized("module") ? new QModule(forProperty("module")) : null;
        this.priority = inits.isInitialized("priority") ? new QPriority(forProperty("priority")) : null;
        this.project = inits.isInitialized("project") ? new QProject(forProperty("project"), inits.get("project")) : null;
        this.release = inits.isInitialized("release") ? new QRelease(forProperty("release")) : null;
        this.severity = inits.isInitialized("severity") ? new QSeverity(forProperty("severity")) : null;
        this.status = inits.isInitialized("status") ? new QDefectStatus(forProperty("status")) : null;
        this.subModule = inits.isInitialized("subModule") ? new QSubModule(forProperty("subModule"), inits.get("subModule")) : null;
        this.type = inits.isInitialized("type") ? new QDefectType(forProperty("type")) : null;
    }

}

