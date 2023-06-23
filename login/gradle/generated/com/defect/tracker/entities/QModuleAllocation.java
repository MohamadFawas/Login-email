package com.defect.tracker.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QModuleAllocation is a Querydsl query type for ModuleAllocation
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QModuleAllocation extends EntityPathBase<ModuleAllocation> {

    private static final long serialVersionUID = -2029703053L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QModuleAllocation moduleAllocation = new QModuleAllocation("moduleAllocation");

    public final QProjectAllocation employee;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QModule module;

    public final QSubModule subModule;

    public QModuleAllocation(String variable) {
        this(ModuleAllocation.class, forVariable(variable), INITS);
    }

    public QModuleAllocation(Path<? extends ModuleAllocation> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QModuleAllocation(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QModuleAllocation(PathMetadata metadata, PathInits inits) {
        this(ModuleAllocation.class, metadata, inits);
    }

    public QModuleAllocation(Class<? extends ModuleAllocation> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.employee = inits.isInitialized("employee") ? new QProjectAllocation(forProperty("employee"), inits.get("employee")) : null;
        this.module = inits.isInitialized("module") ? new QModule(forProperty("module")) : null;
        this.subModule = inits.isInitialized("subModule") ? new QSubModule(forProperty("subModule"), inits.get("subModule")) : null;
    }

}

