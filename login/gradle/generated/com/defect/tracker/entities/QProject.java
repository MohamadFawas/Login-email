package com.defect.tracker.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProject is a Querydsl query type for Project
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProject extends EntityPathBase<Project> {

    private static final long serialVersionUID = 1480975154L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProject project = new QProject("project");

    public final StringPath describtion = createString("describtion");

    public final StringPath endDate = createString("endDate");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath prefix = createString("prefix");

    public final StringPath projectName = createString("projectName");

    public final StringPath startDate = createString("startDate");

    public final QProjectStatus status;

    public final QProjectType type;

    public QProject(String variable) {
        this(Project.class, forVariable(variable), INITS);
    }

    public QProject(Path<? extends Project> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProject(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProject(PathMetadata metadata, PathInits inits) {
        this(Project.class, metadata, inits);
    }

    public QProject(Class<? extends Project> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.status = inits.isInitialized("status") ? new QProjectStatus(forProperty("status")) : null;
        this.type = inits.isInitialized("type") ? new QProjectType(forProperty("type")) : null;
    }

}

