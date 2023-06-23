package com.defect.tracker.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSubModule is a Querydsl query type for SubModule
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSubModule extends EntityPathBase<SubModule> {

    private static final long serialVersionUID = 1915393701L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSubModule subModule = new QSubModule("subModule");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QModule module;

    public final StringPath name = createString("name");

    public QSubModule(String variable) {
        this(SubModule.class, forVariable(variable), INITS);
    }

    public QSubModule(Path<? extends SubModule> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSubModule(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSubModule(PathMetadata metadata, PathInits inits) {
        this(SubModule.class, metadata, inits);
    }

    public QSubModule(Class<? extends SubModule> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.module = inits.isInitialized("module") ? new QModule(forProperty("module")) : null;
    }

}

