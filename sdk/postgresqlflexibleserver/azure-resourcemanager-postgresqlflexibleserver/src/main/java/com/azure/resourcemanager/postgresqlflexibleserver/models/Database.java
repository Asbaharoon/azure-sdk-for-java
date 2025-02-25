// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.DatabaseInner;

/** An immutable client-side representation of Database. */
public interface Database {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the charset property: The charset of the database.
     *
     * @return the charset value.
     */
    String charset();

    /**
     * Gets the collation property: The collation of the database.
     *
     * @return the collation value.
     */
    String collation();

    /**
     * Gets the inner com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.DatabaseInner object.
     *
     * @return the inner object.
     */
    DatabaseInner innerModel();

    /** The entirety of the Database definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The Database definition stages. */
    interface DefinitionStages {
        /** The first stage of the Database definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the Database definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serverName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param serverName The name of the server.
             * @return the next definition stage.
             */
            WithCreate withExistingFlexibleServer(String resourceGroupName, String serverName);
        }
        /**
         * The stage of the Database definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithCharset, DefinitionStages.WithCollation {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Database create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Database create(Context context);
        }
        /** The stage of the Database definition allowing to specify charset. */
        interface WithCharset {
            /**
             * Specifies the charset property: The charset of the database..
             *
             * @param charset The charset of the database.
             * @return the next definition stage.
             */
            WithCreate withCharset(String charset);
        }
        /** The stage of the Database definition allowing to specify collation. */
        interface WithCollation {
            /**
             * Specifies the collation property: The collation of the database..
             *
             * @param collation The collation of the database.
             * @return the next definition stage.
             */
            WithCreate withCollation(String collation);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Database refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Database refresh(Context context);
}
