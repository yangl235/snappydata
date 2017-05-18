# SYS.SET_EVICTION_HEAP_PERCENTAGE_SG

Sets the percentage threshold of Java heap memory usage that triggers members of one or more SnappyData server groups to perform LRU eviction on tables that are configured for eviction.

This procedure sets the percentage threshold for evicting table data from the Java heap for all members of one or more server groups, or for all data stores in the SnappyData cluster. You can optionally set the heap percentage only for the local SnappyData data store by using <a href="set_eviction_heap_percentage.html#reference_A7533A4A873D48FBAB05A67DD5CC7F66" class="xref" title="Sets the percentage threshold of Java heap memory usage that triggers a SnappyData data store to perform LRU eviction on tables that are configured for LRU_HEAP eviction. This procedure executes only on the local SnappyData data store member.">SYS.SET_EVICTION_HEAP_PERCENTAGE</a>. When the used heap reaches the percentage, SnappyData begins to evict rows, using a LRU algorithm, from tables that are configured with LRU_HEAP eviction. <a href="../../overflow/configuring_data_eviction.html#configuring_data_eviction" class="xref" title="Use eviction settings to keep your table within a specified limit, either by removing evicted data completely or by creating an overflow table that persists the evicted data to a disk store.">Create a Table with Eviction Settings</a> describes the eviction process. The default eviction heap percentage is 80% of the critical heap percentage value.

## Syntax

``` pre
SYS.SET_EVICTION_HEAP_PERCENTAGE_SG (
IN PERCENTAGE REAL NOT NULL
IN SERVER_GROUPS VARCHAR(32762)
}
```

**PERCENTAGE**   
The percentage of used heap space that triggers eviction for data stores in the specified server group(s).

**SERVER_GROUPS**
A comma-separated list of server groups on which to apply the heap percentage setting. If you specify NULL, the command is distributed to all data stores (irrespective of defined server groups).

##Example

This command triggers eviction on any member of the "overflows" server group when that member's heap reaches 85%:

``` pre
call sys.set_eviction_heap_percentage_sg (85, 'overflows');
```

This command triggers eviction on all SnappyData data stores when that member's heap reaches 85%:

``` pre
call sys.set_eviction_heap_percentage_sg (85, null);
```

